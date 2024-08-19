package pkg3_constructors;

public class Client3 {
    public static void main(String[] args) {
        Student3 st = new Student3(21,"ABC");
        System.out.println("The student details are : " + st.name+" "+st.age);
        Student3 sarthak = new Student3(st);
        System.out.println(sarthak.name+" "+sarthak.age);
        System.out.println("Address "+sarthak+" "+st);
        Student3 st1 = st;
        System.out.println("Address "+st1+" "+st);
        st.display();
        st.updateAge(28);
    }
}
