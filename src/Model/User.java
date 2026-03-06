package Model;

public abstract class User {

    // Attributes
    private String username;
    private boolean hasAds;
    private boolean canDownload;


    // Constructor
    public User(String username) {
        this.username = username;
    }


    // Getters
    public String getUsername() {
        return username;
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

