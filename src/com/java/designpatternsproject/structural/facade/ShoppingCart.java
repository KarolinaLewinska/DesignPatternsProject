public class ShoppingCart {
    public boolean hasEnoughItemsInCart(Client client, int itemsNumber){
        System.out.println("Checking if " + client.NickName() + " has enough items in cart");
        if(itemsNumber<2) {
            System.out.println("Not enough items in cart to apply the coupon!");
            return false;
        }
        return true;
    }

    public boolean isTotalSumEnough(Client client, int sum){
        System.out.println("Checking if " + client.NickName() + "'s items total worth is enough " +
                "to apply the coupon");
        if(sum<200) {
            System.out.println("Total sum of items is to low to apply the coupon!");
            return false;
        }
        return true;
    }
}
