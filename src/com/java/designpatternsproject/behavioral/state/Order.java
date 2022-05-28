public class Order {
    private OrderState state = new PlacedState();
    public void setState(OrderState newState){
        this.state = newState;
    }

    public void previousState(){
        state.previous(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void showOrderStatus(){
        state.showOrderStatus();
    }
}
