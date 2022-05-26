import java.text.SimpleDateFormat;
import java.util.Date;

public class Eligible extends Decorator{
    boolean isHired;
    Date startDate;

    public Eligible(Candidate candidate) {
        super(candidate);
    }

    public void hire(){
        this.isHired = true;
        this.startDate = new Date();
    }

    @Override
    public void showCandidate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        candidate.showCandidate();

        System.out.println("Hired: " + (this.isHired? "Yes" : "No"));
        System.out.println("Start Date: " + formatter.format(this.startDate));
    }
}
