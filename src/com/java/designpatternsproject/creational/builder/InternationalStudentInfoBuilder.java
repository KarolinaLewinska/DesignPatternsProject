public class InternationalStudentInfoBuilder extends StudentInfoBuilder{
    private Student _student = new Student();
    @Override
    public void AddFirstName() {
        _student.updateInfo("First Name: James");
    }

    @Override
    public void AddLastName() {
        _student.updateInfo("Last Name: Charles");
    }

    @Override
    public void AddIndexNumber() {
        _student.updateInfo("Index number: 654321");
    }

    @Override
    public void AddErasmusInfo() {
        _student.updateInfo("Erasmus Student: Yes");
    }

    @Override
    public Student ReturnStudentInfo() {
        return _student;
    }
}
