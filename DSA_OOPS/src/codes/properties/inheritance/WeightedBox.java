package codes.properties.inheritance;

public class WeightedBox extends Box{
    int weight;

    public WeightedBox(int h,int w, int l,int we){
        // Super must be initialized first
        super(h,w,l);

        this.weight = we;

//        To access parent's properties always use super.property();
        System.out.println(super.width);
    }

    void calculateWeighted(){
        System.out.println(this.height * this.width * this.length + " m^3");
        System.out.println("The weight is : "+this.weight);
    }
}

// Static  methods can be inherited but cannot be override because it does not depend on object
// Overriding depends on objects and static does not depend on objects.
// Overriding concept is work in runtime while overloading works at compile time