package design_patterns.structural_patterns.flyweight_design_pattern.gaming_scenario;

public class RoboticDog implements Robot {

    private String type;
    private Sprites body; // small 2D bitmap (graphic element)

    RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the Robotic Dog sprites object and x and y coordinates to render the image
        System.out.println("Displaying Robotic Dog on " + x + "," + y);
    }
}
