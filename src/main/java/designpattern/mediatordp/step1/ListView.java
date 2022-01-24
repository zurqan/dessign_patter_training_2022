package designpattern.mediatordp.step1;

import java.util.List;
import java.util.stream.Stream;

public class ListView {


    private final ListItem[] items;

    public ListView(ListItem... items) {
        this.items = items;
    }


    public Stream<ListItem> items(){
        return Stream.of(items);
    }

    public void unSelectAll(){
        items().forEach(li->li.setSelected(false));
    }

    public static class ListItem {
        private boolean selected;
        private boolean hidden;
        private final String text;

        public ListItem(String text) {
            this.text = text;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        @Override
        public String toString() {
            return "ListItem{" +
                    "selected=" + selected +
                    ", hidden=" + hidden +
                    ", text='" + text + '\'' +
                    '}';
        }

        public boolean isSelected() {
            return selected;
        }

        public String getText() {
            return text;
        }

        public boolean isHidden() {
            return hidden;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }

        public static ListItem of(String text){
            return new ListItem(text);
        }
    }
}
