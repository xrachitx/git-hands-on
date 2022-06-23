public class StrCompare{
  public static void main(String []args){
     String comp1="Alliance Softech";
     String comp2="Alliance Softech";
     String str1=comp1.toLowerCase();
     String str2=comp1.toUpperCase();
     String str3=comp1.substring(9,13);
   //  String str4=comp1.insert(10, " IT ");
     String str5=comp1.concat(comp1.substring(9,13));
     String str6=comp1.replace("Soft","Java");
     System.out.println("Str1 :" + str1);
     System.out.println("Str2 :" + str2);
     System.out.println("Str3 :"+ str3);
  //   System.out.println("Str4 :" + str4);
     System.out.println("Str5 :" + str5);
     System.out.println("Str6 :" + str6);
     if(comp1.equals(comp2)){
        System.out.println("Equal Strings");
     }
     else{
        System.out.println("Not Equal Strings");
     }
     if(comp1 == comp2){
        System.out.println("Equal Strings");
     }
     else{
        System.out.println("Not Equal Strings");
     }
  }
}
