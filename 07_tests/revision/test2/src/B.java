public class B extends A {
    public int size;
    public String unit;

    public B(int weight, String wUnit, int size, String unit){
        super(weight, wUnit);
        this.size = size;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    private int getSize(){
        return size;
    }


    public String toString() {
        return super.toString() +
                getSize() + getUnit();
    }

    public static void main(String[] args) {
        B b = new B(4, " kg ", 5, " cbm ");

        System.out.println(b);
    }
}