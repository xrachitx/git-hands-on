class Animal{  
void eat(){System.out.println("eating");}  
}  
  
class Dog extends Animal{  
void eat(){System.out.println("eating fruits");}  
}  
  
class BabyDog extends Dog
{  
void eat(){System.out.println("drinking milk");
} } 
  class OverridenEx{
public static void main(String args[])
{ 
BabyDog b=new BabyDog(); 
Animal a=new Animal();  
Dog d=new Dog();  

a.eat();  
b.eat();  
d.eat();  
}  
}