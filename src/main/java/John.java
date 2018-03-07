public class John extends Kids implements ISport {

    private String favouriteToy;


    public John(String surname, String address, double pocketmoney, String favouriteToy) {
        super(surname, address, pocketmoney);
        this.favouriteToy = favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy =  favouriteToy;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    @Override
    public String play(String sport){
        return "I am playing "+ sport;

    }
}
