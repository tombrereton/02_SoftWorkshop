// either 1, or 2, or 3.
Pattern p = Pattern.compile("[1-3]");

int n;
Scanner s = new Scanner(System.in);

/*  reads next word which must correspond 
 *  to either 1, or 2, or 3.
 */
n = s.nextInt(p);
