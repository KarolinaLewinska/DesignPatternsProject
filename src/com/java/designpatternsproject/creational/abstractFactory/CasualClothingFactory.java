import javax.naming.OperationNotSupportedException;

public class CasualClothingFactory extends ClothingFactory{
    @Override
    public WomansClothing addWomansClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case PANTS -> {
                return new Pants("XS", "blue", "casual");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }

    @Override
    public MansClothing addMansClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case SHIRT -> {
                return new Shirt("M", "orange", "casual");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }

    @Override
    public ChildrensClothing addChildrensClothing(ClothingType type) throws OperationNotSupportedException {
        switch(type){
            case JACKET -> {
                return new Jacket("S", "yellow", "casual");
            }
            default -> throw new OperationNotSupportedException("Unknown clothing type");
        }
    }
}
