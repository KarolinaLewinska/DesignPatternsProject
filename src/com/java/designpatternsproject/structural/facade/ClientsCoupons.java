public class ClientsCoupons {
    public boolean hasEnoughPoints(Client client, int points){
        System.out.println("Checking if " + client.NickName() + " has enough points to apply the coupon");
        if(points<500) {
            System.out.println("Not enough points to apply the coupon!");
            return false;
        }
        return true;
    }
}
