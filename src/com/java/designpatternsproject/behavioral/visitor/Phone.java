public class Phone extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
