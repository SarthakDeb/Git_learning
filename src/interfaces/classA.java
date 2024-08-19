package interfaces;

public class classA implements interfacesI1 {
    @Override
    public void run() {
        System.out.println("I am A, I can run");
    }

    public void eat(){
        System.out.println("I am A, I can eat");
    }
}
