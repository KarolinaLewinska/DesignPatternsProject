import javax.naming.OperationNotSupportedException;

public class FormalClothingFactory extends ClothingFactory{
    @Override
    public WomansClothing addWomansClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case PANTS -> {
                return new Pants("S", "beige", "formal");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }

    @Override
    public MansClothing addMansClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case SHIRT -> {
                return new Shirt("L", "black", "formal");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }

    @Override
    public ChildrensClothing addChildrensClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case JACKET -> {
                return new Jacket("XS", "white", "formal");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }
}
