/**
 * @author Austin Cappuccio
 * Takes in a tune and makes it adaptable for a song
 */
public class SongAdapter extends Song{
    Tune tune;

    /**
     * The constructor that takes in a new tune
     * @param tune The tune to be adapted
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /** 
     * Takes in the display title and gets just the Title of the song
     * @return String The title of the song
     */
    public String getTitle() {
        String song = tune.getDisplayTitle();
        int spot = 0;
        for (int i = 0; i < song.length(); i++) {
            if (song.charAt(i) == ':') {
                spot = i;
            }
        }
        String ret = song.substring(0, spot-1);
        return ret;
    }
    
    /** 
     * Takes in the display title and gets just the album of the song
     * @return String The album of the song
     */
    public String getAlbum() {
        String song = tune.getDisplayTitle();
        int spot = 0;
        for (int i = 0; i < song.length(); i++) {
            if (song.charAt(i) == ':') {
                spot = i;
            }
        }
        String ret = song.substring(spot + 2);
        return ret;
    }
    
    /** 
     * Gets the first name of the artist from the combined name
     * @return String Artist first name
     */
    public String getArtistFirstName() {
        String name = tune.getArtistName();
        String[] split = name.split("\\s+");
        return split[0];
    }
    
    /** 
     * Gets the last name of the artist from the combined name
     * @return String Artist last name
     */
    public String getArtistLastName() {
        String name = tune.getArtistName();
        String[] split = name.split("\\s+");
        return split[1];
    }
    
    /** 
     * Gets the genre of the song from the string input
     * @return String Adapted Genre
     */
    public String getGenre() {
        String cat = tune.getCategory();
        if (cat.equalsIgnoreCase("Country and Western")) {
            return "Country";
        } else if (cat.equalsIgnoreCase("R&B and Soul")) {
            return "Jazz";
        } else if (cat.equalsIgnoreCase("Easy Listening")) {
            return "Other";
        } else if (cat.equalsIgnoreCase("Rock")) {
            return "Rock";
        } else if (cat.equalsIgnoreCase("Classic Rock")) {
            return "Rock";
        } else {
            return "Other";
        }
    }
}
