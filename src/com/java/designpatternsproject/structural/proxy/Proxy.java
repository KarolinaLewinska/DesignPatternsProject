public class Proxy extends Movie{
    private SpecificMovie _specificMovie;
    private boolean _isOldEnoughToWatch;
    private  int _age = 16;

    public Proxy(int age){
        if(_age <= age){
            _isOldEnoughToWatch = true;
        }
    }
    @Override
    public String WatchMovie() {
        if(_isOldEnoughToWatch){
            if(_specificMovie == null){
                _specificMovie = new SpecificMovie();
            }
            System.out.println("You can now watch the movie: "+ _specificMovie.WatchMovie());
            return "You can now watch the movie: "+ _specificMovie.WatchMovie();
        }
        else{
            System.out.println("You are not old enough to watch this movie!");
            return "You are not old enough to watch this movie!";
        }
    }
}
