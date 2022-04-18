import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EnglishState implements State{

    private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> lyrics = getLyrics("TwinkleEnglish.txt");
        box.playSong("Twinkle Twinkle Little Star", lyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> lyrics = getLyrics("HappyEnglish.txt");
        box.playSong("Happy and you know it", lyrics);
    }

    public void pressEnglishButton() {
        System.out.println("You are already in english mode!");
    }

    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }

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