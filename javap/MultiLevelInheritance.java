class P{
  int e,f;

  int get(int a,int b){
   e=a; f=b;
   return(0);
  }

  void Show(){
   System.out.println("Value :" + e);
  }
}

class Q extends P{
   void Showq(){
     System.out.println("Q");
   }
}

class MultiLevelInheritance extends Q{

   void display(){
     System.out.println("R");
   }

   public static void main(String []args){
     P p = new P();
     Q q = new Q();
     p.get(6,4);
     p.Show();
     q.Showq();
  }
}

