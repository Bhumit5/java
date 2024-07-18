package enums;

public class enums {
    enum Weeks{
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        //* These are enum constants
        //* public, static and final
        //* since it's final you can't create child enums

        //* This is constructor so it will by default
        Weeks(){
            System.out.println("The day is " + this);
        }

        //* This is not public or protected, only default or private
        //* Because, we don't want to create new objects
        //* this is not enum's concept that's why

        //* Internally: public static final Weeks Saturday = new Weeks();

        //* Abstracts are not allowed here
    }


    public static void main(String[] args) {
        Weeks weeks;

        weeks = Weeks.Friday;
        for(Weeks day: Weeks.values()){
            System.out.print(day+", ");
        }
            System.out.print("");

        System.out.println(weeks);

        //* It will give the index of the item
        System.out.println(weeks.ordinal());
    }
}
