public class ParticleFactory {
    int[] coordinatesX;
    int[] coordinatesY;
    int size;

    public ParticleFactory(int[] coordinatesX, int[] coordinatesY, int size){
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.size = size;
    }
    public ParticleFactory(int[] coordinatesX, int[] coordinatesY){
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.size = 3;
    }

    public SpecificParticle getParticle(int x, int y){

        SpecificParticle particle = new SpecificParticle(x, y, size);

        return particle;
    }
}
