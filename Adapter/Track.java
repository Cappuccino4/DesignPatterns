/**
 * @author Austin Cappuccio
 * Tracks in the modern day class
 */
public class Track extends Song {
    String title;
    String album;
    String firstName;
    String lastName;
    Genre genre;

    /**
     * The constructor that takes in indivdual components of a song and combines them into one object
     * @param title Title of the song
     * @param album Album of the song
     * @param firstName First name of the artist
     * @param lastName Last name of the artist
     * @param genre Genre of the song
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Getters
     */
    public String getTitle() {
        return title;
    }
    public String getAlbum() {
        return album;
    }
    public String getArtistFirstName() {
        return firstName;
    }
    public String getArtistLastName() {
        return lastName;
    }
    public String getGenre() {
        return genre.toString();
    }

}
