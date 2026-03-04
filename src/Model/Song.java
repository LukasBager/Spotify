package Model;

public class Song {
    private String title;
    private String artist;
    private Genre genre; //musikgenre fra enum

    public Song(String title, String artist, Genre genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
        //getters
        public String getTitle() {
            return title;
        }
        public String getArtist() {
            return artist;
        }
        public Genre getGenre() {
            return genre;
        }
//setter så man kan ændre titlen
        public void setTitle(String title) {
            this.title = title;
        }

        @Override
                public String toString() {
            return title + " - " + artist + " (" + genre + ")";
        }
    }
