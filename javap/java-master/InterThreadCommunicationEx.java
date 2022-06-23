class Transaction{  
int amount=10000;  
  
synchronized void withdraw(int amount){  
System.out.println("Withdrawal Process has Started");  
  
if(this.amount<amount){  
System.out.println("Balance Not Sufficient");  
try{wait();}catch(Exception e){}  
}  
this.amount-=amount;  
System.out.println("withdraw completed");  
}  
  
synchronized void deposit(int amount){  
System.out.println("Deposit Process has started");  
this.amount+=amount;  
System.out.println("deposit completed");  
notify();  
}  
}  
  
class InterThreadCommunicationEx{  
public static void main(String args[]){  
Transaction t=new Transaction();  
new Thread(){  
public void run(){t.withdraw(1000);}  
}.start();  
new Thread(){  
public void run(){t.deposit(10000);}  
}.start();  
  
}}  