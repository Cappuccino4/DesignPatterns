/**
 * @author Austin Cappuccio
 * A class to hold the oldie songs' information
 */
public class Oldie implements Tune {
    String artistName;
    String songTitle;
    String recordTitle;
    String category;

    /**
     * The constructor that takes in indivudal components of an oldie and puts them in one object
     * @param artistName Name of the artist
     * @param songTitle Name of the song
     * @param recordTitle Title of the album
     * @param category Genre of the song
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Getters
     */
    public String getArtistName() {
        return artistName;
    }

    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }

    public String getCategory() {
        return category;
    }
}
