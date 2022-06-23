public class ConcatTest{
   public static String concatWithString(){
      String t="SkillP";
      for(int i=0;i<10000;i++){
         t=t + "Pedia";
      }
      return t;
   }
   public static String concatwithStringBuffer(){
     StringBuffer sb = new StringBuffer("Skill");
     int l=sb.capacity();
     System.out.println("Length : " + l);
     for(int i=0;i<10000;i++){
        sb.append("Pedia");
     }
     return sb.toString();
   }
   public static void main(String []args){
     long startTime=System.currentTimeMillis();
     concatWithString();
     System.out.println("Time taken by Concating with String: "+ (System.currentTimeMillis() - startTime) + "ms");
     startTime=System.currentTimeMillis();
     concatwithStringBuffer();
     System.out.println("Time taken by Concating with StringBuffer: "+ (System.currentTimeMillis() - startTime) + "ms");
   }
}
