public class LocalStudentInfoBuilder extends StudentInfoBuilder {
    private Student _student = new Student();
    @Override
    public void AddFirstName() {
        _student.updateInfo("First Name: Aleksandra");
    }

    @Override
    public void AddLastName() {
        _student.updateInfo("Last Name: Kowalska");
    }

    @Override
    public void AddIndexNumber() {
        _student.updateInfo("Index Number: 123456");
    }

    @Override
    public void AddErasmusInfo() {
        _student.updateInfo("Erasmus Student: No");
    }

    @Override
    public Student ReturnStudentInfo() {
        return _student;
    }
}
