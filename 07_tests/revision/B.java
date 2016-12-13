
public class B extends A {
    public int k = 5;
    public B(int i, int j, int k) {
        super(i,k,-1);
k = i + k; }
    @Override
    public int f(int k) {
        return super.f(k) + k;
    }
}