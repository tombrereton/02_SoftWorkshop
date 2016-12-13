
public class A implements C {

    private int i;
    public int j;
    public int k;

    public A (int i, int j, int k){
        this.i=i;
        this.j=j;
    }
    public int f(int k) {
        return this.i + this.j +this.k;
    }
}
