public class SpecificMovie extends Movie{
    private String movie;

    public SpecificMovie(){
        this.movie = "Fast and Furious: Tokyo Drift";
    }
    @Override
    public String WatchMovie() {
        return movie;
    }
}
