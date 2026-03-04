package Model;

public class PremiumUser extends User {


    public PremiumUser (String username, String playlist) {
        super(username, playlist);
    }

    @Override
    public void showAds() {

    }

    @Override
    public boolean canDownload() {
        return false;
    }
}


