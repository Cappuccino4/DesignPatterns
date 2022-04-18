import java.util.ArrayList;

/**
 * The music box class is used to create music box objects to play two different songs in 3 different languages
 * @author Austin Cappuccio
 */
public class MusicBox {

    /**
     * All of the states used for the project including the current state
     */
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * The constructor that creates each of the specific states and then sets the boxes state to english by default
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    
    /** 
     * Set state method sets the state of the box
     * @param state The state we want to switch to
     */
    public void setState(State state) {
        this.state = state;
    }

    
    /** 
     * Returns the english state instance
     * @return State English state instance from MusicBox
     */
    public State getEnglishState() {
        return englishState;
    }

    /** 
     * Returns the French state instance
     * @return State French state instance from MusicBox
     */
    public State getFrenchState() {
        return frenchState;
    }

    /** 
     * Returns the Spanish state instance
     * @return State Spanish state instance from MusicBox
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays Twinkle Twinkle in whatever language the state is in
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Plays Happy if you know it in whatever language the state is in
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Either switches to english or lets the user know we are already there
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Either switches to Spanish or lets the user know we are already there
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Either switches to French or lets the user know we are already there
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    
    /** 
     * Play song takes in the name of a song an array list of the lyrics of the song, writes out the name and then plays the song line by line
     * @param name The name of the song
     * @param lyrics An arraylist of the lyrics of the song line by line
     */
    public void playSong(String name, ArrayList<String> lyrics) {
        System.out.println("Playing: " + name);
        for (int i = 0; i < lyrics.size(); i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(lyrics.get(i));
        }
    }

}