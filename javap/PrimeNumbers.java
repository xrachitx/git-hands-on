class PrimeNumbers{
  public static void main(String []args){
     int i=0, j=1;
     int num=3;
     i=3;
     while(j <= num){
       if(TestNumber(i)){
          System.out.print(i + ",");
          i++; j++;
       }
       i++;
     }
    System.out.println("");
  }

  static boolean TestNumber(int n){
    int p;
    boolean result=true;
    for(p=2;p<n/2;p++){
       if(n%p == 0){
          result=false;
          break;
       }
    }
    return result;
  }
}
