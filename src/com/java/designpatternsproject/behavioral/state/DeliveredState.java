public class DeliveredState implements OrderState {
    @Override
    public void previous(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void next(Order order) {
        System.out.println("The order has been delivered and is marked as finished");
    }

    @Override
    public void showOrderStatus() {
        System.out.println("The order has been delivered");
    }
}
