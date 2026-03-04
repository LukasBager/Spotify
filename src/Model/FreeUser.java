package Model;

public class FreeUser extends User {


    public FreeUser(String username, String playlist) {
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
