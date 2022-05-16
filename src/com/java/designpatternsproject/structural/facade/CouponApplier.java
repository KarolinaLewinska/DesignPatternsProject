public class CouponApplier {
    private ShoppingCart _shoppingCart = new ShoppingCart();
    private ClientsCoupons _clientsCoupons = new ClientsCoupons();

    public boolean canCouponBeApplied(Client client, int itemsNumber, int totalSum, int points){
        boolean canBeApplied = true;

        if (!_shoppingCart.hasEnoughItemsInCart(client, itemsNumber))
        {
            canBeApplied = false;
        }
        else if (!_shoppingCart.isTotalSumEnough(client, totalSum))
        {
            canBeApplied = false;
        }
        else if (!_clientsCoupons.hasEnoughPoints(client, points))
        {
            canBeApplied = false;
        }

        return canBeApplied;
    }
}
