/**
 * Written by Austin Cappuccio
 * A class that extends an iterator so that the exersises in the iterator can be looped through
 */

public class ExerciseIterator implements Iterator{

    Exercise[] exercises;
    int position;
    
    /**
     * The constructor to make a new iterator
     * @param exercises The exercises to add to the iterator
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
        position = 0;
    }

    
    /** 
     * A method to see if there is more exersises in the iterator
     * @return boolean True if there are more exersises and false if there is not
     */
    public boolean hasNext() {
        if (position >= exercises.length || exercises[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    
    
    /** 
     * A method to return the current exersise and change it to the next one
     * @return Exercise returns the current exersise
     */
    public Exercise next() {
        Exercise exercise = exercises[position];
        position += 1;
        return exercise;
    }

}
