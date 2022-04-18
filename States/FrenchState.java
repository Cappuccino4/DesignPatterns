import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
* The French state class handles all functions when the box is in its French state
* @author Austin Cappuccio
*/
public class FrenchState implements State{
    /**
     * The box varaible that is needed to switch states and play songs
     */
    private MusicBox box;

    /**
     * Constructor for the French state where we take in a MusicBox object and set it to our box varaible
     */
    public FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * Gets the lyrics for the correct song and then calls the method for the box to play the song
     */
    public void pressStarButton() {
        ArrayList<String> lyrics = getLyrics("TwinkleFrench.txt");
        box.playSong("Scintille, scintille, petite étoile", lyrics);
    }

    /**
     * Gets the lyrics for the correct song and then calls the method for the box to play the song
     */
    public void pressHappyButton() {
        ArrayList<String> lyrics = getLyrics("HappyFrench.txt");
        box.playSong("Si tu es heureux et que tu le sais", lyrics);
    }

    /**
     * Switches to English mode
     */
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }

    /**
     * Already in French mode so we tell the user
     */
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français!");
    }

    /**
     * Switches to Spanish mode
     */
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }

    /** 
     * Takes in a string for the file name and then outputs the files contents line by line in an arraylist
     * @param fileName The name of the file for song lyrics
     * @return ArrayList<String> The lyrics in an arraylist
     */
    public ArrayList<String> getLyrics(String fileName) {
        ArrayList<String> ret = new ArrayList<String>();
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {
				ret.add(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return ret;
    }
}
