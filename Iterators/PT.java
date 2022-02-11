import java.util.ArrayList;

/**
 * Written by Austin Cappuccio
 * This is the PT class which allows users to add their workout routine to.
 */

public class PT {
    
    String firstName;
    String lastName;
    String bio;
    Exercise[] exercises;
    int numExercises;

    /**
     * Constructor for the new PT workout routine
     * @param firstName The first name of the user
     * @param lastName The last name of the user
     * @param bio The bio of the user
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        numExercises = 2;
        exercises = new Exercise[numExercises];
    }

    
    /** 
     * Adds Exercises to the PT routine
     * @param title The name of the exersise
     * @param muscleGroups The muscle groups that the exersise hits
     * @param directions The directions on how to do the workout
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        for(int i = 0; i < exercises.length; i++) {
            if (exercises[i] != null) {
                exercises = growArray(exercises);
                break;
            }
        }
        for(int i = 0; i < exercises.length; i++) {
            if (exercises[i] == null) {
                exercises[i] = new Exercise(title, muscleGroups, directions);
                break;
            }
        }
    }

    
    /** 
     * Grows the inputted array by two and then returns the new array with two null array spots at the end of the array
     * @param exercises The old array 
     * @return retArr[] The new array that is larger by two
     */
    private Exercise[] growArray(Exercise[] exercises) {
        numExercises += 2;
        Exercise[] tempArr = exercises;
        Exercise[] retArr = new Exercise[numExercises];
        for (int i = 0; i < tempArr.length; i++) {
            retArr[i] = tempArr[i];
        }
        return retArr;
    }
    
    
    /** 
     * Creates an iterator for the workout
     * @return ExerciseIterator The new iterator
     */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }

    
    /** 
     * Returns the full name and bio of the persons workout
     * @return String The full name and bio
     */
    public String toString() {
        return firstName + " " + lastName + "\n" + bio + "\n";
    }
    
    
    /** 
     * Gets the first name of the user
     * @return String First name
     */
    public String getFirstName() {
        return this.firstName;
    }

    
    /** 
     * Gets the last name of the user
     * @return String Last Name
     */
    public String getLastName() {
        return this.lastName;
    }

    
    /** 
     * Gets the bio of the user
     * @return String Bio
     */
    public String getBio() {
        return this.bio;
    }

}
