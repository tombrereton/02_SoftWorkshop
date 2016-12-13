public class A {
    private String a;
    public String b;

    A(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return this.a + " b: " + this.b;
    }

    public static void main(String[] args) {
        A a = new A("1","2");
        System.out.println(a);
    }
}