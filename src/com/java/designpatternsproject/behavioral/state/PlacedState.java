public class PlacedState implements OrderState{
    @Override
    public void previous(Order order) {
        System.out.println("The order has just been placed. There is no previous track.");
    }

    @Override
    public void next(Order order) {
        order.setState(new CompletedState());
    }

    @Override
    public void showOrderStatus() {
        System.out.println("The order has been placed and waits for being completed");
    }
}
