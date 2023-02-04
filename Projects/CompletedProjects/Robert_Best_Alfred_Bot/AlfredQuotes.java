import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("Good day, %s.", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Mr. Wayne, todays date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away Mr. Wayne";
        }
        if (conversation.indexOf("Alfred") > -1){
            return "I know many things Mr.Wayne but the location of your Yo-Yo is beyond me.";
        }
        return "That is for you to decide Mr. Wayne.";
    }


    public String newQuote() {
        
        return "What a wonderful day Mr.Wayne, or in your case night.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

