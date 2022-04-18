import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FrenchState implements State{
    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> lyrics = getLyrics("TwinkleFrench.txt");
        box.playSong("Scintille, scintille, petite étoile", lyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> lyrics = getLyrics("HappyFrench.txt");
        box.playSong("Si tu es heureux et que tu le sais", lyrics);
    }

    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français!");
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
