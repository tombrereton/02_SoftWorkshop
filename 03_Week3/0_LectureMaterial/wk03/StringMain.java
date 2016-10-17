public class StringMain{   
    /*
     *  s.substring(n,m) with take the substring from the n-th
     *  character inclusively to the m-th character exclusively Note,
     *  we start counting from 0.
     */

    public static void main(String[] args){
 	String s;

	s = "Hello, Java\u2122";
	System.out.println("s.substring(0,4) --> " + s.substring(0,4));
    }
}
