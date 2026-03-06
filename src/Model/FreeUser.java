package Model;

public class FreeUser extends User {

    public FreeUser(String username) {
        super(username);
        this.setHasAds(true);
        this.setCanDownload(false);
    }

}
