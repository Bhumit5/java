package abstracts;

abstract class parent{
    abstract void display();
    void thor(){
        System.out.println("I am a thor");
    }
}

class child extends parent{

    @Override
    void display(){
        System.out.println("Hello");
    }
}

public class abstracts extends child{

    public static void main(String[] args) {
        child ch = new child();

        ch.display();
        ch.thor();
    }
}
