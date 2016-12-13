public class C extends B {
    public String colour;

    public C(int weight,
             String wUnit,

             int size,
             String sUnit,
             String colour) {
        super(weight, wUnit,
                size, sUnit);
        this.colour = colour;
    }
    public String toString() {
        return colour + " "	 ;
    }
    public static void
    main(String[] args) {
        C c = new C(3, " kg ",
                4, " cbm ", " blue");
        System.out.println(c);
    }
}