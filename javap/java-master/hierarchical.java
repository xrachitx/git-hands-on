class hierarchical {
  public static void main(String []args) {
    PNB p=new PNB();
    SBI s=new SBI();
  }
}

class Bank {
  protected double rateofInterest;
  Bank() {
    rateofInterest=0.0;
  }
}

class SBI extends Bank {
  SBI() {
    rateofInterest=4.5;
    System.out.println("Rate of Interest in SBI is:"+rateofInterest);
  }
}

class PNB extends Bank {
  PNB() {
    rateofInterest=5.5;
    System.out.println("Rate of Interest in PNB is:"+rateofInterest);
  }
}
