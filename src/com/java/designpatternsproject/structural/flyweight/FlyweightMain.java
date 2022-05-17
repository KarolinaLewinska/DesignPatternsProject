public class FlyweightMain {
    public static void main(String[] args){
        int[] coordinatesX = new int[]{15, 4, 63, 22};
        int[] coordinatesY = new int[]{13, -1, 2, 64};
        int size = 1;

        ParticleFactory factory = new ParticleFactory(coordinatesX, coordinatesY, size);

        for(int i = 0; i<coordinatesX.length; i++){
            if(coordinatesY.length < i) break;
            factory.getParticle(coordinatesX[i], coordinatesY[i]).createParticle();
        }

        System.out.println("Default size particles: ");

        ParticleFactory factoryWithDefaultSizeParticles = new ParticleFactory(coordinatesX, coordinatesY);
        for(int i = 0; i<coordinatesX.length; i++){
            if(coordinatesY.length< i) break;
            factoryWithDefaultSizeParticles.getParticle(coordinatesX[i], coordinatesY[i]).createParticle();
        }
    }
}
