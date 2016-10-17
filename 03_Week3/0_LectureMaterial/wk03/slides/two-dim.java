System.out.println("INIT FOR A TWO-DIM. ARRAY");
int [][] d = {{ 2, 3, 4}, 
              { 5, 6, 7}, 
              {24,25,26}, 
              { 6, 7, 8}};

for (int[]  element : d){
    for (int el : element){
        System.out.printf("%4d ",el);
    }
    System.out.println();
}
