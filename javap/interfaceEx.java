interface interface1{
  int blue=4;
  int yellow=5;
  int pink=6;
  void display1(int color);
}

interface interface2{
  void display2();
}

class A implements interface1,interface2{
  public void display1(int color) {
      switch(color){
        case blue:
           System.out.println("Blue Color Selected");
           break;
        case yellow:
           System.out.println("Yellow Color Selected");
           break;
        case pink:
           System.out.println("Pink Color Selected");
           break;
        default:
           System.out.println("Unknown Color Selected");
           break;
      }
  }

  public void display2(){
      System.out.println("display2 method");
  }
}

public class interfaceEx{
  public static void main(String []args){
    A a=new A();
    a.display1(4);
    a.display1(5);
    a.display1(6);
    a.display1(7);
    a.display2();
  }
}
