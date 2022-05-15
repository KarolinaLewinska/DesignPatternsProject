import java.util.ArrayList;

public class Student {
    private ArrayList<String> _studentInfo = new ArrayList<String>();

    public void updateInfo(String info){
        _studentInfo.add(info);
    }

    public void showStudentInfo(){
        System.out.println("Student's Info: \n");
        for (String info : _studentInfo){
            System.out.println(info + "\n");
        }
    }
}
