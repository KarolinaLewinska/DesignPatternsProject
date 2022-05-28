public class ShippedState implements OrderState {
    @Override
    public void previous(Order order) {
        order.setState(new CompletedState());
    }

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void showOrderStatus() {
        System.out.println("The order has been shipped and waits for being delivered.");
    }
}
