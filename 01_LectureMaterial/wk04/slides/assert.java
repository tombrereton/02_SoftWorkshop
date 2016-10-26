public class AssertExample {
    public static void main(String[] args) {
        int x = -5;
        x = Math.abs(x);
        assert x >= 0;
        System.out.println(Math.sqrt(x));
    }
}
