import somePackage.A;
public class D extends A {
    public void DPrint() {
        System.out.println(A.v1); //access
        System.out.println(A.v2); //access
        System.out.println(A.v3); //no access, compiler error
        System.out.println(A.v4); //no access, compiler error
    }
}
