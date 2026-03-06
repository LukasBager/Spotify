package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Playlist {
    private ArrayList<Song> Song;

    public Playlist() {
        Songs = new ArrayList<>();
    }

    //tilføj sange
    public void addSong(Song song) {
        song.add(Song);
        System.out.println("Sang tilføjet til Playlisten");
    }

    //Fjern sang
    public void removeSong(String title) {
        boolean found = false;
        for (Song song : Songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songs.remove(song);
                System.out.println("Sangen blev fjernet");
                found = true;
                break;
            }
        }
    }

        System.out.println("Sangen blev ikke fundet");
    //vis alle sange
    public void showSongs; ()

    {
        if (songs.isempty()) {
            System.out.println("Playlisten er tom");
            return;
        }
        for (Song song : songs) {
            System.out.println(song);

        }
    }
    //Søg efter sang
    public Song findSong(String title) {
        for (Song song : song) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;

            }
        }
        return null;
        //Redigere titel
        public void editSong (String oldTitle, String newTitle){
            Song song = findSong(oldTitle);
            if (song != null) {
                song.setTitle(newTitle);
                System.out.println("Sangen blev opdateret");
            } else {
                System.out.println("Sangen blev ikke fundet");
            }
            //Sorter sange
            public void sortSong () {
                Collection.sort(Songs, Comparator.comparing(song.getTitle));
                System.out.println("Playlisten er nu sorteres.");
            }
            //hent listen
            public ArrayList<Song>getSong(){
                return Songs;
            }
        }

    }
}




