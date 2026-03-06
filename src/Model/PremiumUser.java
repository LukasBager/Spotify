package Model;

public class PremiumUser extends User {

    public PremiumUser(String username, int userID) {
        super(username, userID);
        this.setHasAds(false);
        this.setCanDownload(true);
    }

}


