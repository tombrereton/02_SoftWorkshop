
public class Main{
    public static void
      main(String[] args) {
        A a = new A(1,2,3);
        System.out.println(a.f(4));
        B b = new B(1,2,3);
        System.out.println(b.f(4));
        C c = new B(1,2,3);
        System.out.println(c.f(4));
        D d = new D(1,2,3);
        System.out.println(d.f(4));
    }
}