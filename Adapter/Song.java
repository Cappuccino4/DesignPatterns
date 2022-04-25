public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
    public String toString() {
        return this.getTitle() + "\nAlbum: " + this.getAlbum() + "\nBy: " + this.getArtistFirstName() + " " + this.getArtistFirstName() + "\nGenre: " + this.getGenre() + "\n";
    }
}
