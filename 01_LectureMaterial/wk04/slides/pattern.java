// any number of a followed by a single b
Pattern p1 = Pattern.compile("a*b"); 

// any number of a,b,c in any order
Pattern p2 = Pattern.compile("[abc]*");

// any number of letters
Pattern p3 = Pattern.compile("[a-zA-Z0-9]*");

// any number of letters followed by a single @, 
// followed by any number of letters.
Pattern p4 = Pattern.compile("[a-zA-Z.]*@[a-zA-Z.]*");
