package design_patterns.structural_patterns.flyweight_design_pattern.gaming_scenario;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

    private static Map<String, Robot> roboticObjectCache = new HashMap<>();

    public static Robot createRobot(String robotType) {
        if(roboticObjectCache.containsKey(robotType)) {
            System.out.println("Serving from cache");
            return roboticObjectCache.get(robotType);
        }

        if(robotType.equals("HUMANOID")) {
            Sprites humanoidSprite = new Sprites();
            Robot humanoidObject = new HumanoidRobot(robotType, humanoidSprite);
            roboticObjectCache.put(robotType, humanoidObject);
            return humanoidObject;
        }

        if(robotType.equals("ROBOTICDOG")) {
            Sprites roboticDogSprite = new Sprites();
            Robot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
            roboticObjectCache.put(robotType, roboticDogObject);
            return roboticDogObject;
        }

        return null;
    }
}
