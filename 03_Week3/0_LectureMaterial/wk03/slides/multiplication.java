int length = 12;
int[][] multi = new int[length][length];
for (int i=0; i < length; i++){
    for (int j=0; j<length; j++){
        multi[i][j] = i*j;
    }
}
	
for (int[] element : multi){
    for (int el : element){
        System.out.print(el + " ");
    }
    System.out.println();
}