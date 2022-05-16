import javax.naming.OperationNotSupportedException;

public class AbstractFactoryMain {
    public static void main(String[] args) throws OperationNotSupportedException {
        ClothingFactory casualClothingFactory = new CasualClothingFactory();
        ClothingFactory formalClothingFactory = new FormalClothingFactory();

        WomansClothing casualPants = casualClothingFactory.addWomansClothing(ClothingType.PANTS);
        MansClothing casualShirt = casualClothingFactory.addMansClothing(ClothingType.SHIRT);
        ChildrensClothing casualJacket = casualClothingFactory.addChildrensClothing(ClothingType.JACKET);

        WomansClothing formalPants = formalClothingFactory.addWomansClothing(ClothingType.PANTS);
        MansClothing formalShirt = formalClothingFactory.addMansClothing(ClothingType.SHIRT);
        ChildrensClothing formalJacket = formalClothingFactory.addChildrensClothing(ClothingType.JACKET);

        System.out.println("Womans pants: \n"
        + "Size: " + casualPants.size + " Color: " + casualPants.color + " Style: " + casualPants.style);
        System.out.println("Size: " + formalPants.size + " Color: " + formalPants.color + " Style: " + formalPants.style);

        System.out.println("Mans shirts: \n"
                + "Size: " + casualShirt.size + " Color: " + casualShirt.color + " Style: " + casualShirt.style);
        System.out.println("Size: " + formalShirt.size + " Color: " + formalShirt.color + " Style: " + formalShirt.style);

        System.out.println("Childrens jackets: \n"
                + "Size: " + casualJacket.size + " Color: " + casualJacket.color + " Style: " + casualJacket.style);
        System.out.println("Size: " + formalJacket.size + " Color: " + formalJacket.color + " Style: " + formalJacket.style);
    }
}
