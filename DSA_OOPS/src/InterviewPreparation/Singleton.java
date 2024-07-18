package InterviewPreparation;
//Singlton class
//public class singleObject{
//    private static singleObject Object;
//
//    private singleObject(){}
//
//    public static singleObject getInstance(){
//        if (Object == null){
//            Object = new singleObject();
//        }
//
//        return Object;
//    }
//}

class A{
    protected int a = 53;

    private void px(){
        int m = 555;
        System.out.println(m);
    }

    public void pxx(){
        px();
        System.out.println("1111");
    }

    void mx(){
        int x = 50;
        System.out.println(x);
    }
}

class B extends A{
    public void ppx(){
        super.pxx();
    }

    public void pxx(){
        System.out.println("2222");
    }
}

class C{
    static void mx(){
        System.out.println("1111");
//        my();
        System.out.println("3333");
    }

    static void my(){
        System.out.println("2222");
    }
}

public class Singleton {

    public static void main(String[] args) {
//        A obj = new A();
        A obj = new A();
//        obj.ppx();
        obj.pxx();

//        obj.mx();
        C ob = new C();
        ob.my();
    }
}
