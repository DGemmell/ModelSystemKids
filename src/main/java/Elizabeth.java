public class Elizabeth extends Kids implements IDance {

    private String favouriteSong;
    private IDance dance;

    public Elizabeth(String surname, String address, double pocketmoney, String favouriteSong) {
        super(surname, address, pocketmoney);
        this.favouriteSong = favouriteSong;
    }

    public void setFavouriteSong(String favouriteSong) {
        this.favouriteSong =  favouriteSong;
    }

    public String getFavouriteFriend() {
        return favouriteSong;
    }


    @Override
    public String dance() {
        return "I am dancing";
    }
}
