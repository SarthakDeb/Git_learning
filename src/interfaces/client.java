package interfaces;

public class client {
    public static void main(String[] args) {
        interfacesI1 a = new classA();
        interfacesI1 b = new classB();

        a.run();
        b.run();
    }
}
