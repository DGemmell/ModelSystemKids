public abstract class Kids {

    String surname;
    String address;
    String parents;
    double pocketmoney;

    public Kids(String surname, String address, double pocketmoney) {
        this.surname = surname;
        this.address = address;
        this.pocketmoney = pocketmoney;
    }

    public String getSurname(){
        return surname;
    }

    public String getAddress(){
        return address;
    }


    public double getPocketMoney(){
        return pocketmoney;
    }
}
