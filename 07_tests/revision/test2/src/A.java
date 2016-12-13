public class A {
    private int weight;
    private String unit;
    public A(int weight,
             String unit) {
        this.weight = weight;
        this.unit = unit;
    }
    public int getWeight() {
        return weight;
    }
    public String getUnit() {
        return unit;
    }
    public String toString() {
        return this.weight +getUnit();
    }
    public static void
    main(String[] args) {
        A a = new A(5, " kg ");
        System.out.println(a);
    }
}