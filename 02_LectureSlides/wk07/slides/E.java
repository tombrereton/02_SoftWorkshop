import somePackage.A;
public class E {
    public void EPrint() {
        System.out.println(A.v1); //access
        System.out.println(A.v2); //no access, compiler error
        System.out.println(A.v3); //no access, compiler error
        System.out.println(A.v4); //no access, compiler error
    }
}
