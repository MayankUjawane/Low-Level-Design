package design_patterns.structural_patterns.flyweight_design_pattern.gaming_scenario;

public class HumanoidRobot implements Robot {

    private String type;
    private Sprites body; // small 2D Bitmap (graphic element)

    HumanoidRobot(String type, Sprites body) {
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
        // use the Humanoid Robotic sprites object and x and y coordinates to render the image
        System.out.println("Displaying Humanoid Robot on " + x + "," + y);
    }
}
