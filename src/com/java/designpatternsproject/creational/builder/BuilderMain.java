public class BuilderMain {
    public static void main(String[] args){
        Director director = new Director();

        StudentInfoBuilder student1 = new LocalStudentInfoBuilder();
        StudentInfoBuilder student2 = new InternationalStudentInfoBuilder();

        director.buildStudentInfo(student1);

        student1.ReturnStudentInfo().showStudentInfo();

        director.buildStudentInfo(student2);

        student2.ReturnStudentInfo().showStudentInfo();
    }
}
