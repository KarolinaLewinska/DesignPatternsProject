public class SpecificParticle extends Particle{
    public int coordinateX;
    public int coordinateY;
    public int size;

    public SpecificParticle(int x, int y, int size){
        this.coordinateX = x;
        this.coordinateY = y;
        this.size = size;
    }
    @Override
    public void createParticle() {
        System.out.println("Created particle's information: \n X: " + coordinateX + "\n Y: " + coordinateY
        + "\n Size: " + size);
    }
}
