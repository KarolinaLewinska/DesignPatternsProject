public class FacadeMain {
    public static void main(String[] args){
        CouponApplier couponApplier = new CouponApplier();
        Client client = new Client("Annx");

        boolean canCouponBeApplied = couponApplier.canCouponBeApplied(client,3,350,550);

        System.out.println(canCouponBeApplied ? "Coupon for -20% off was applied!" : "The coupon is not available");
    }
}
