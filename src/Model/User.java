package Model;

public abstract class User {

    // Attributes
    private String username;
    private int userID;
    private boolean hasAds;
    private boolean canDownload;


    // Constructor
    public User(String username, int userID) {
        this.username = username;
        this.userID = userID;
    }


    // Getters
    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public boolean getHasAds() {
        return hasAds;
    }

    public boolean getCanDownload() {
        return canDownload;
    }


    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setHasAds(boolean hasAds) {
        this.hasAds = hasAds;
    }

    public void setCanDownload(boolean canDownload) {
        this.canDownload = canDownload;
    }


    // Manual toString
    @Override
    public String toString() {
        return "";
    }

}

