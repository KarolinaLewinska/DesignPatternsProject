public class MementoMain {
    public static void main(String[] args){
        Product product = new Product("Product1");
        product.add();
        product.add();
        product.saveProduct();
        product.remove();
        product.undoChanges();
    }
}
