package Service;


import Model.Genre;
import Model.Song;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 Handles all file IO.
 No UI logic.
 No throws — exceptions handled internally.
**/
public class FileManager {

        private static final String FILE_PATH = "playlist.txt";

        public ArrayList<Song> getSongs() {
            ArrayList<Song> songs = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {

                String line;

                while ((line = reader.readLine()) != null) {

                    if (line.isEmpty()) break;

                    String[] parts = line.split(",");

                    String title = parts[0];
                    String artist = (parts[1]);
                    Genre genre = Genre.valueOf((parts[2]));

                    Song song = new Song(title, artist, genre);

                    songs.add(song);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return songs;
        }

    public void writeSongTitle(ArrayList<Song> songs) {

        FileWriter writer = null;

        try {

            writer = new FileWriter("playlist.txt");
            writer.write("Add a new song");

            for (Song song : songs) {
                writer.write(song.getTitle()); // Polymorphism in action
                writer.write("/n");       // FileWriter has no newLine() method
            }

            writer.flush(); // ensure data is written

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    // Get song names
}
