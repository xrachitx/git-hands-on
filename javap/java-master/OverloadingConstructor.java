class OverloadingConstructor {
    String domainName;
    public OverloadingConstructor(){
        this.domainName = "ABC";
    }
    public OverloadingConstructor(String domainName){
        this.domainName = domainName;
    }
    public void getName(){
        System.out.println(this.domainName);
    }
    public static void main(String[] args) {
     OverloadingConstructor  Obj1 = new OverloadingConstructor ();
OverloadingConstructor  Obj2 = new OverloadingConstructor ("CTS");
        Obj1.getName();
        Obj2.getName();
    }
}