package designpattern.strategydp;

public class NavigationApplication {

    private RouteStrategy routeStrategy;

    /// list of method related to application
    //....
    ///


    public Route getBestRoute(Point a, Point b ){

        return routeStrategy.connect(a, b);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
