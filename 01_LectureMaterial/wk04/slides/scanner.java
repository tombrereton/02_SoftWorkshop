String str;
int n;
double d;
// creates a new scanner object, reads from the terminal
Scanner s = new Scanner(System.in);

//  reads next word of input (delimited by white spaces).
str = s.next();

// reads next integer. Exception if next word not int
n = s.nextInt();

// reads next double. Exception if next word not double
d = s.nextdouble();
