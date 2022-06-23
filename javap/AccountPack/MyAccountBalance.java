package AccountPack;

class MyBalance{
  String name;
  double balance;
  MyBalance(String n, double b){
     name=n;
     balance=b;
  }
  void show(){
     if(balance > 0){
        System.out.println("-->");
        System.out.println(name + ":$" + balance);
     }
  }
}

class MyAccountBalance{
  public static void main(String []args){
     MyBalance current[] = new MyBalance[3];
     current[0] = new MyBalance("Ram",3434.44);
     current[1] = new MyBalance("Sandeep",35734.44);
     current[2] = new MyBalance("Pavan",78834.44);
     for(int i=0; i<3; i++) current[i].show();
  }
}

