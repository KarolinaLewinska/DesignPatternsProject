public class InternCandidate extends Candidate {
    public String studyField;
    public int studyYear;

    public InternCandidate(String firstName, String lastName, int age, String studyField, int studyYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studyField = studyField;
        this.studyYear = studyYear;
        this.desiredPosition = "Software development intern";
    }

    @Override
    public void showCandidate() {
        System.out.println("\nCandidate for position: " + this.desiredPosition);
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Currently studying " + this.studyField + " on year " + this.studyYear);
    }
}
