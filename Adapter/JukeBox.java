import java.util.HashMap;

/**
 * @author Austin Cappuccio
 * A Class to create a JukeBox that houses a hashmap for all of the songs
 */
public class JukeBox {
    HashMap<String, Song> songs;
    int currentSongs;

    /**
     * The constructor which creates the hashmap
     */
    public JukeBox() {
        songs = new HashMap<String, Song>();
        currentSongs = 0;
    }
    
    
    /** 
     * A class that takes in a song and adds it to the jukebox
     * @param song The song to be added
     */
    public void addSong(Song song) {
        currentSongs++;
        songs.put(song.getTitle().toLowerCase(), song);
    }

    
    /** 
     * Checks if the song exists and if it does we print out the information for it
     * @param songName The song to play
     */
    public void play(String songName) {
        if (songs.containsKey(songName.toLowerCase())) {
            System.out.println(songs.get(songName.toLowerCase()).toString());
        } else {
            System.out.println("Sorry!");
        }
    }

}
