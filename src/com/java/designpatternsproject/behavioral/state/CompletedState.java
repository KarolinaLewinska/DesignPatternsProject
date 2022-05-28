public class CompletedState implements OrderState{
    @Override
    public void previous(Order order) {
        order.setState(new PlacedState());
    }

    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void showOrderStatus() {
        System.out.println("The order has been completed and waits for being shipped.");
    }
}
