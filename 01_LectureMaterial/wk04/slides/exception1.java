System.out.println("Provide n, m with m != 0");
try {
    n = Integer.parseInt(args[0]); 
    m = Integer.parseInt(args[1]);
    System.out.println("n/m: " + (n/m));
}
catch (NumberFormatException e) {
    System.out.println("Oops. Numbers of type int expected!");
catch (IllegalArgumentException e) {
    System.out.println("Oops. Do not divide by zero!");
}
