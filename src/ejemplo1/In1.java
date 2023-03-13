package ejemplo1;
public interface In1 {
    // public, static and final
    final int a = 10;
    // public and abstract
    public void display();
}
// A class that implements the interface.
class TestClass implements In1 {

    // Implementing the capabilities of interface
    public void display(){
        System.out.println("saludos a todos!");
    }

    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}
