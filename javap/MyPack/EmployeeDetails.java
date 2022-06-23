package MyPack;

class Emp{
  String name;
  int employeeid;
  Emp(String n, int empid){
    name=n;
    employeeid=empid;
  }
  public void display(){
    System.out.println("Employee: " + name);
    System.out.println("Employee Id: " + employeeid);
  }
}

class EmployeeDetails{
   public static void main(String []args){
      int p;
      Emp []e = new Emp[4];
      e[0] = new Emp("Ax",101);
      e[1] = new Emp("Bx",102);
      e[2] = new Emp("Cx",103);
      e[3] = new Emp("Dx",104);
      
      for(p=0;p<4;p++)
          e[p].display();
    }
}
