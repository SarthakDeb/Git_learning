package pkg3_constructors;

public class Student3 {
    int age;
    String name;

//    Parameterised constructor
    public Student3(int studentAge, String studentName){
        age = studentAge;
        name = studentName;
    }
//    copy constructor
    public Student3(Student3 student){
        age = student.age;
        name = student.name;
   }
   public void display(){
       System.out.println(name+" "+age);
   }
   public void updateAge(int Age){
        age = Age;
        System.out.println(name+" "+age);
    }
}


