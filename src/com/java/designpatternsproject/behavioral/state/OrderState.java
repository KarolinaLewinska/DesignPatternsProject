public interface OrderState {
    void previous(Order order);
    void next(Order order);
    void showOrderStatus();

}
