public class Earphones extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
