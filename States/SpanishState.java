import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SpanishState implements State{
    private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> lyrics = getLyrics("TwinkleSpanish.txt");
        box.playSong("Brilla brilla pequeña estrella", lyrics);
    }

    public void pressHappyButton() {
        ArrayList<String> lyrics = getLyrics("HappySpanish.txt");
        box.playSong("Si eres feliz y lo sabes aplaude", lyrics);
    }

    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("¡Ya estás en Modo Español!");
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
