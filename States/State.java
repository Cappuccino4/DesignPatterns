import java.util.ArrayList;

/**
 * The State interface which allows us to have all of the same methods for all the different states
 * @author Austin Cappuccio
 */
public interface State {
    public void pressStarButton();
    public void pressHappyButton();
    public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
    public ArrayList<String> getLyrics(String fileName);
}
