package Main;

import Model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        User user;

        System.out.println("Kunne du tænke dig at benytte vores Free eller Premium plan? Svar Free/Premium");
        boolean choicePremium;
        String planChoice = scanner.nextLine();
        if (planChoice.equalsIgnoreCase("free")) {
            choicePremium = false;
        } else if (planChoice.equalsIgnoreCase("premium")) {
            choicePremium = true;
        } else {
            System.out.println("Ugyldigt input. Du er blevet sat på vores Free plan.");
            choicePremium = false;
        }

        System.out.println("Vælg et brugernavn");
        String username = scanner.nextLine();

        if (choicePremium) {
            user = new PremiumUser(username, 1);
        } else {
            user = new FreeUser(username, 1);
        }



        int choice;

        do {
            System.out.println("\nVelkommen " + user.getUsername() + " til dit hjemmelavede Spotify!");
            System.out.println("1. Tilføj ny sang");
            System.out.println("2. Fjern en sang");
            System.out.println("3. Vis alle sange");
            System.out.println("4. Søg efter en sang");
            System.out.println("5. Rediger en sang");
            System.out.println("6. Sorter sanglisten");
            System.out.println("7. Afslut");
            if (user.getCanDownload()) {
                System.out.println("8. Download din playliste");
            }

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
                    playlist.sorterSange();
                    break;

                case 7:
                    System.out.println("Programmet afsluttes...");
                    break;
                case 8:
                    if (user.getCanDownload()) {
                        System.out.println("Downloader din playliste....");
                        System.out.println("Din playlsite er nu downloadet");
                    } else {
                        System.out.println("Ugyldigt valg!");
                    }
                    break;
                default:
                    System.out.println("Ugyldigt valg!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
