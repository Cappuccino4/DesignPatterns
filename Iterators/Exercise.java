import java.util.ArrayList;

/**
 * Written by Austin Cappuccio
 * The Exercise class makes Exersise Objects which hold the name, target muscles and the directions for that workout
 */

public class Exercise {
    
    String title;
    ArrayList<String> targetMuscles;
    ArrayList<String> directions;

    /**
     * Creates an exersise with just a title
     * @param title The title of the exersise
     */
    public Exercise(String title) {
        this.title = title;
        this.targetMuscles = null;
        this.directions = null;
    }

    /**
     * Creates an exersise with a title, muscles, and directions
     * @param title The title of the exersise
     * @param targetMuscles The muscles the exersise will workout
     * @param directions The directions for how to do the exersise
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    
    /** 
     * Adds a muscle to the target muscles for that exersise
     * @param muscle The muscle that is being added
     */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }

    
    /** 
     * Removes a muscle to the target muscles for that exersise
     * @param muscle The muscle that is being removed
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    
    /** 
     * A method that takes the data of the name of the exersise, the targeted msucles, and the directions and returns it in a clean string
     * @return String The combination of the name of the exersise, the targeted muscles listed, and the directions listed
     */
    public String toString() {
        String targetedMuscles = "Targeted Muscles: ";
        String directionsStr = "Directions: \n";

        for (int i = 0; i < targetMuscles.size(); i++) {
            targetedMuscles += targetMuscles.get(i);
            if (i + 1 != targetMuscles.size()) {
                targetedMuscles += ", ";
            }
        }

        for (int i = 0; i < directions.size(); i++) {
            directionsStr += "- " + directions.get(i) + "\n";
        }

        return "\n" + title + "\n" + targetedMuscles + "\n" + directionsStr;
    }

}
