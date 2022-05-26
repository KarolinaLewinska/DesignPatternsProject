public class Product {
    private String productName;
    private int productQuantity;
    private Counter productCounter;
    private CounterState savedCounter;

    public Product(String productName){
        this.productName = productName;
        this.productCounter = new Counter();
        this.productQuantity = productCounter.getCount();
    }
    public void add(){
        this.productCounter.addToCount();
        this.productQuantity = this.productCounter.getCount();
    }
    public void remove(){
        this.productCounter.subtractFromCount();
        this.productQuantity = this.productCounter.getCount();
    }

    public void saveProduct(){
        savedCounter = productCounter.saveCounter();
        this.productQuantity = this.productCounter.getCount();
        System.out.println("Saved quantity: " + this.productQuantity + " of product: " + this.productName);
    }
    public void undoChanges(){
        productCounter.undo(savedCounter);
        this.productQuantity = this.productCounter.getCount();
        System.out.println("Changes undone. Current quantity of " + this.productName + ": " + this.productQuantity);
    }
}
