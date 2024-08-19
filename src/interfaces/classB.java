package interfaces;

public class classB implements interfacesI1{
    @Override
    public void run() {
        System.out.println("I am B, I can run");
    }

    public void speak(){
        System.out.println("I am B, I can speak");
    }
}
