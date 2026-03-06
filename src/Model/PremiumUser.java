package Model;

public class PremiumUser extends User {

    public PremiumUser(String username) {
        super(username);
        this.setHasAds(false);
        this.setCanDownload(true);
    }

}


