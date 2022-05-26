public class DecoratorMain {
    public static void main(String[] args){
        ManagerCandidate candidate1 = new ManagerCandidate("Jane", "Austin", 32, 10);
        InternCandidate candidate2 = new InternCandidate("John", "Doe", 21, "Computer Science", 2);

        candidate1.showCandidate();
        candidate2.showCandidate();

        Eligible hiredCandidate = new Eligible(candidate1);
        hiredCandidate.hire();
        hiredCandidate.showCandidate();
    }
}
