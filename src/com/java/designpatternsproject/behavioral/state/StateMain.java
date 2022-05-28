public class StateMain {
    public static void main(String[] args){
        Order newOrder = new Order();
        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
        newOrder.showOrderStatus();
        newOrder.nextState();
    }
}
