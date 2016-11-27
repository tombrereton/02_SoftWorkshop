package somePackage;
public class C extends A {
    public void CPrint() {
        System.out.println(v1); //access
        System.out.println(v2); //access
        System.out.println(v3); //access
        System.out.println(v4); //no access, compiler error
    }
}
