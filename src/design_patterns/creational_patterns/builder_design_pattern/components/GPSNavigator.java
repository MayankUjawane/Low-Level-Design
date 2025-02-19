package design_patterns.creational_patterns.builder_design_pattern.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        route = "route";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
