public class VisitorMain {
    public static void main(String[] args){
        Visitor visitor = new ElementVisitor();

        Order order = new Order();
        order.addToOrder(new Phone());
        order.addToOrder(new Charger());
        order.addToOrder(new Earphones());

        order.accept(visitor);
    }
}
