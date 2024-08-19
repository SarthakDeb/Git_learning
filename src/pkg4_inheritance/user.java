package pkg4_inheritance;

public class user {
    String username;
    void login(){
        System.out.println("I "+username+" have logged in.");
    }
    void userdetails(user u){
        System.out.println(u.username);
    }
}
