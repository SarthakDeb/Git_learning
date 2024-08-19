package pkg1;
import pkg2.Student;

public class StudentChild extends Student {
    public static void main(String[] args) {
        StudentChild studentChild = new StudentChild();
        studentChild.psp = 86;
//        studentChild.name = "Sarthak";
        studentChild.universityName = "ABC";
//        studentChild.age = 27;
    }
}
