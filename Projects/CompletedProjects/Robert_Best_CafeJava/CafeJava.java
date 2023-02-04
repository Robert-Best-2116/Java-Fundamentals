public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String remaningBalance = "That will be an additional $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffeePrice = 1.99;
        double latteePrice = 3.99;
        double cappucinoPrice = 4.99;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        // Cindhuris order status
        System.out.println(customer1 + pendingMessage);

        // Noah's order status
        if(isReadyOrder2) {
            System.out.println(customer4 + readyMessage);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sams Order, order status changed to true for testing. 
        System.out.println(displayTotalMessage + (latteePrice + latteePrice));

        if(isReadyOrder3) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        //Jimmy's Order
        System.out.println(displayTotalMessage + (latteePrice - dripCoffeePrice));

        System.out.println(remaningBalance + (latteePrice - dripCoffeePrice));

        //Addtional

        if(isReadyOrder4) {
            System.out.println(customer3 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }


    }
}
