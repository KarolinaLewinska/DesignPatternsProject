public class ElementVisitor implements Visitor{
    @Override
    public void visit(Phone phone) {
        System.out.println("Phone Xiaomi Redmi 11 Note added to order");
    }

    @Override
    public void visit(Charger charger) {
        System.out.println("Charger in color: white added to order");
    }

    @Override
    public void visit(Earphones earphones) {
        System.out.println("Wireless earphones in color: black added to order");
    }
}
