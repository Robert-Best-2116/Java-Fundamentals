import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    // Get Streak Goal. 

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10 ; i++){
            sum = sum + i;

        }
        return sum;

    }
    // No idea why that really works. it looks through the line items adding them together why? 
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (double i: lineItems){
            sum = sum + i;
        }
        return sum;
    }


    /*  lowkey mindboggleing, had to look at the solutions and goggle to try to break down how this even works. its 'void' because it dosent return anything, we then pass in the method, a class function, "displayMenu", and we pass in the "ArrayList<String>" it has to be a String because its an object wrapper and array lists cant use primitive value types. and then pass in the array list that is created in the test cafe file. by all of the menu.add methods. we use size instead of length according to google because .length is for the length of arrays and size is used for arraylists. and ArrayLists dont have a .length method. .get is used to return the spesific index of an array. i understood what the %s and %s were for returning string values, and its because the int i is convered to a string by that notation, even though i is an int. it was type cast. in the format. which is printf. */

    public void displayMenu(ArrayList<String> menu) {

        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%s %s \n", i, menu.get(i));
        }
    }

    /* so what i learned from the last one and the walk through ill need the .add method. to push the new person to the ArrayList, but before that add the code in that is provided in the add customer walk through. pass in the variable into the println, if i use + i should be able to concat the user name, or i can just use /n if i need to format it like the previous one in display menu. pulled .size from the for loop from the menu since its relative to the size of the array list.  */

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello "+ userName);
        System.out.printf("There are %s people infront of you \n", customers.size());
        customers.add(userName);
        System.out.println(customers);



    } 
    // It worked first time out the gate!!!!! WOOO big win. 



}