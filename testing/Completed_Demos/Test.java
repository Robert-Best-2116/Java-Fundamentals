import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
                
        System.out.println(things);


    }
}