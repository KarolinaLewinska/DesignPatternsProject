abstract class Decorator extends Candidate {
    protected Candidate candidate;

    public Decorator(Candidate candidate){
        this.candidate = candidate;
    }

    @Override
    public void showCandidate() {
        candidate.showCandidate();
    }
}
