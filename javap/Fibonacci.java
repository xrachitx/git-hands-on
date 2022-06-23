class Fibonacci{
 public static void main(String []args){
   int i=0, count=1;
   int t=10;
   while (count<t){
     System.out.println(Term(count));
     count++;
   }
 }

 static  int Term(int n){
   if (n==1){
    return 0;
   }
   else if(n==2){
    return 1;
   }
   else {
    return (Term(n-1) + Term(n-2));
   }
  }
}
