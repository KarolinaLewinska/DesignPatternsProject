import javax.naming.OperationNotSupportedException;

public abstract class ClothingFactory {
    public abstract WomansClothing addWomansClothing(ClothingType type) throws OperationNotSupportedException;
    public abstract MansClothing addMansClothing(ClothingType type) throws OperationNotSupportedException;
    public abstract ChildrensClothing addChildrensClothing(ClothingType type) throws OperationNotSupportedException;
}
