public class B extends A {
    private String a;

    B(String a, String b) {
        super(b, a);
    }

    public String toString() {
        return this.b + " a: " + this.a;
    }

    public static void main(String[] args) {

        B b = new B("1","2");
        System.out.println(b);

        A c = new B("1","2");
        System.out.println(c);


    }


}