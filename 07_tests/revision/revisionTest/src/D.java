
public class D extends B implements C {
    public D(int i, int j, int m) {
        super(i,j,m);
    }
    public int f(int k) {
        return super.f(k) +this.j * this.k;
    }
}
