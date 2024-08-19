package pkg4_inheritance;

public class client4 {
    public static void main(String[] args) {
         student st = new student();
         user newuser = new user();
//         student st0 = new user();
        user newuser0 = new student();
         st.psp = 90.0;
         st.taketest();
         st.username = "ABCst";
         st.login();
         st.userdetails(st);
        newuser.username = "ABCst0";
        newuser.userdetails(newuser);
        newuser0.login();
//        newuser0.taketest();
    }
}
