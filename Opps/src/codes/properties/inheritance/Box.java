package codes.properties.inheritance;

public class Box {
    int height,length,width;


    Box(int h,int w,int l){
        this.height = h;
        this.length = l;
        this.width = w;
    }

    Box(int side){
        this.height = side;
        this.length = side;
        this.width = side;
    }

    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    void calculate(){
        System.out.println(this.height * this.width * this.length + " m^3");
    }
}
