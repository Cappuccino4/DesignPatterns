import java.util.ArrayList;

public interface State {
    public void pressStarButton();
    public void pressHappyButton();
    public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
    public ArrayList<String> getLyrics(String fileName);
}
