package Model;

public class FreeUser extends User {

    public FreeUser(String username, int userID) {
        super(username, userID);
        this.setHasAds(true);
        this.setCanDownload(false);
    }

}
