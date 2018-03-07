import java.util.ArrayList;

public class Joseph extends Kids implements ISport {

    private String favouriteFriend;
    private ArrayList<Sport> activities;

    public Joseph(String surname, String address, double pocketmoney, String favouriteFriend) {
        super(surname, address, pocketmoney);
        this.favouriteFriend = favouriteFriend;
        this.activities = new ArrayList<>();
    }

    public void setFavouriteFriend(String favouriteFriend) {
        this.favouriteFriend =  favouriteFriend;
    }

    public String getFavouriteFriend() {
        return favouriteFriend;
    }

    public int activityCount(){

        return activities.size();
    }

    public void addSport(Sport sport){

        activities.add(sport);
    }

    @Override
    public String play(String sport) {
        return "I am playing " + sport;
    }
}
