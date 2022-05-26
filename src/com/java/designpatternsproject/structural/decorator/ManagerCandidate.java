public class ManagerCandidate extends Candidate{

    public int yearsOfExperience;

    public ManagerCandidate(String firstName, String lastName, int age, int yearsOfExperience){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.desiredPosition = "Team A Project Manager";
    }
    @Override
    public void showCandidate() {
        System.out.println("\nCandidate for position: " + this.desiredPosition);
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Years of experience: " + this.yearsOfExperience);
    }
}
