package Model;

public abstract class User {

        private String username;
        private String playlist;


        public User(String username, String playlist) {
            this.username = username;
            this.playlist = playlist;

        }

        public String getUsername() {
            return username;
        }

        public void getPlaylist(String username) {
            this.username = username;
        }

        public String setUsername() {
            return username;
        }

        public void setPlaylist(String playlist) {
            this.playlist = playlist;
        }


        public abstract void showAds();

        public abstract boolean canDownload();


        @Override
        public String toString() {
            return username + "," + playlist;
        }

    }

