package Main;

import Model.Genre;
import Model.Playlist;
import Model.Song;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int choice;

        do {
            System.out.println("\nVelkommen til dit hjemmelavede Spotify!");
            System.out.println("1. Tilføj ny sang");
            System.out.println("2. Fjern en sang");
            System.out.println("3. Vis alle sange");
            System.out.println("4. Søg efter en sang");
            System.out.println("5. Rediger en sang");
            System.out.println("6. Sorter sanglisten");
            System.out.println("7. Afslut");

            System.out.print("Vælg en mulighed: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Titel: ");
                    String title = scanner.nextLine();

                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();

                    System.out.print("Genre (ROCK, POP, JAZZ, HIPHOP, CLASSICAL): ");
                    String genreInput = scanner.nextLine();

                    try {
                        Genre genre = Genre.valueOf(genreInput.toUpperCase());
                        Song song = new Song(title, artist, genre);
                        playlist.addSong(song);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ugyldig genre!");
                    }
                    break;

                case 2:
                    System.out.print("Indtast titel på sang der skal fjernes: ");
                    String removeTitle = scanner.nextLine();
                    playlist.removeSong(removeTitle);
                    break;

                case 3:
                    playlist.showSongs();
                    break;

                case 4:
                    System.out.print("Indtast titel på sang: ");
                    String searchTitle = scanner.nextLine();

                    Song found = playlist.findSong(searchTitle);

                    if (found != null) {
                        System.out.println("Fundet: " + found);
                    } else {
                        System.out.println("Sangen blev ikke fundet.");
                    }
                    break;

                case 5:
                    System.out.print("Indtast titel på sang der skal ændres: ");
                    String oldTitle = scanner.nextLine();

                    System.out.print("Ny titel: ");
                    String newTitle = scanner.nextLine();

                    playlist.editSong(oldTitle, newTitle);
                    break;

                case 6:
                    playlist.sortSong();
                    break;

                case 7:
                    System.out.println("Programmet afsluttes...");
                    break;

                default:
                    System.out.println("Ugyldigt valg!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
