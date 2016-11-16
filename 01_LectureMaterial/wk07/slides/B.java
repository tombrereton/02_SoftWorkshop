package somePackage;
public class B {
    public void BPrint() {          
        System.out.println(A.v1); //access
        System.out.println(A.v2); //access
        System.out.println(A.v3); //access
        System.out.println(A.v4); //no access, compiler error
    }       
}
