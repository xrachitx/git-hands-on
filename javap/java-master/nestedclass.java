class MainClass {
  int a=50;
  void display(){
    NestedClass nest = new NestedClass();
    nest.showData();
  }
  class NestedClass{
    void showData(){
       System.out.println("The Value stored in variable a is : " + a);
    }
  }
}

class SampleNestedClass {
   public static void main(String args[]) {
     MainClass mc = new MainClass();
     mc.display();
   }
}
