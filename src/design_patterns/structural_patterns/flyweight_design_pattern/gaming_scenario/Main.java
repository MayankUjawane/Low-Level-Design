package design_patterns.structural_patterns.flyweight_design_pattern.gaming_scenario;

public class Main {
    public static void main(String[] args) {
        Robot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        Robot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10, 20);

        Robot roboticDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboticDog1.display(2, 3);

        Robot roboticDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboticDog2.display(21, 30);
    }
}
