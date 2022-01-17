import javax.xml.transform.stream.StreamSource;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TestStream {

    public static void main(String[] args) {

//        Stream<Integer> integerStream = Stream.of(1, 2, 3);//.distinct();
        Stream<Integer> integerStream = Stream.iterate(1,a->a+1);
        Stream<String> stringStream = Stream.of("a", "b", "c","d");

//        Spliterator<Integer> integerSpliterator = integerStream.spliterator();
//        int intChar = integerSpliterator.characteristics();
//        System.out.println("intChar = " + intChar);
//        System.out.println("Spliterator.DISTINCT&intChar = " + (Spliterator.DISTINCT & intChar));

        Stream<String> zip = zip(integerStream, stringStream, (a, b) -> b + "," + a);
        zip
                .forEach(System.out::println);
    }


    public static<A, B, C> Stream<C> zip(Stream<? extends A> a,
                                         Stream<? extends B> b,
                                         BiFunction<? super A, ? super B, ? extends C> zipper) {
        Objects.requireNonNull(zipper);
        Spliterator<? extends A> aSpliterator = Objects.requireNonNull(a).spliterator();
        Spliterator<? extends B> bSpliterator = Objects.requireNonNull(b).spliterator();

        // Zipping looses DISTINCT and SORTED characteristics
        int characteristics = aSpliterator.characteristics() & bSpliterator.characteristics() &
                ~(Spliterator.DISTINCT | Spliterator.SORTED);

        long zipSize = ((characteristics & Spliterator.SIZED) != 0)
                ? Math.min(aSpliterator.getExactSizeIfKnown(), bSpliterator.getExactSizeIfKnown())
                : -1;

        Iterator<A> aIterator = Spliterators.iterator(aSpliterator);
        Iterator<B> bIterator = Spliterators.iterator(bSpliterator);
        Iterator<C> cIterator = new Iterator<C>() {
            @Override
            public boolean hasNext() {
                return aIterator.hasNext() && bIterator.hasNext();
            }

            @Override
            public C next() {
                return zipper.apply(aIterator.next(), bIterator.next());
            }
        };

        Spliterator<C> split = Spliterators.spliterator(cIterator, zipSize, characteristics);
        return (a.isParallel() || b.isParallel())
                ? StreamSupport.stream(split, true)
                : StreamSupport.stream(split, false);
    }

}
