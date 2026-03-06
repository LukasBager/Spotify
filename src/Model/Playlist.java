package Model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    //tilføj sange
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Sang tilføjet til Playlisten");
    }

    //Fjern sang
    public void removeSong(String title) {
        boolean found = false;
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songs.remove(song);
                System.out.println("Sangen blev fjernet");
                found = true;
                break;
            }
        }
        System.out.println("Sangen blev ikke fundet");
    }

    //vis alle sange
    public void showSongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlisten er tom");
        }
        for (Song song : songs) {
            System.out.println(song);

        }
    }

    //Søg efter sang
    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;

            }
        }
        return null;
    }

    public void editSong(String oldTitle, String newTitle) {
        Song song = findSong(oldTitle);
        if (song != null) {
            song.setTitle(newTitle);
            System.out.println("Sangen blev opdateret");
        } else {
            System.out.println("Sangen blev ikke fundet");
        }
    }
    //Bobblesort efter titel

    public void sorterSange() {
        for (int i = 0; i < songs.size() - 1; i++) {
            for (int j = 0; j < songs.size() - 1 - i; j++) {
                String titel1 = songs.get(j).getTitle().toLowerCase();
                String titel2 = songs.get(j + 1).getTitle().toLowerCase();
                if (titel1.compareTo(titel2) > 0) {
                    Song temp = songs.get(j);
                    songs.set(j, songs.get(j + 1));
                    songs.set(j + 1, temp);
                }
            }
        }
        System.out.println("Playlisten er sorteret alfabetisk.");
    }


    public ArrayList<Song> getSong() {
        return songs;
    }

}




