class  DemoObject{
    int class_var = 10;

    void demoMethod(int a ){
        System.out.println("class_var:" + class_var);
        System.out.println("Argument value passed form main by objec creation: " + a);
    }

    public static void main(String args[]){
        System.out.println("Demo Object and method");
        DemoObject obj1 = new DemoObject();
        obj1.demoMethod(30);

    }
}