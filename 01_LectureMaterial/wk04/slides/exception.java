System.our.println("Provide n, m with m != 0");
try {   
    n = Integer.parseInt(args[0]); 
    m = Integer.parseInt(args[1]);
    System.out.println("n/m: " + (n/m));
}
catch (IllegalArgumentException e) {
    // By "catch" we say what should happen
    // if the error occurs.
    System.out.println("Oops. Do not divide by zero");
}
