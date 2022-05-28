import java.util.ArrayList;
import java.util.List;

public class Order extends Element{
    List<Element> orderElements = new ArrayList<>();

    public void addToOrder (Element newElement){
        this.orderElements.add(newElement);
    }
    @Override
    public void accept(Visitor visitor) {
        for(Element element : this.orderElements){
            element.accept(visitor);
        }
    }
}
