class TwoDimArray{
  public static void main(String []args){
    int i,j;
    int[][] matrixa = {{1,2,3},{3,2,3}};
    for(i=0;i<2;i++){
      for(j=0;j<3;j++){
        System.out.print(matrixa[i][j] + " ");
      }
      System.out.println();
    }
  }
}
