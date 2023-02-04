import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{


    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        Random randomNumbers = new Random();

        for (int i = 1; i <= 10; i++) {
            tenRolls.add(randomNumbers.nextInt(20) + 1);
        }

        return tenRolls;
    }


    public String letterGetter() {

        Random randomLetter = new Random();

        String theAlphabet = "abcdefghijklmnopqrstuvwxyz";

        char theLetter = theAlphabet.charAt(randomLetter.nextInt(26));
        return theAlphabet.valueOf(theLetter);

    } 


    //Password Generator

        //create a random password with the length of 8, use the previous method with a for loop to repeate the proccess eight times and push the 
        //new letters to the array. use arrayName.add and use the character. 

    public String passwordGenerator () {


        String password = "" ;

        for (int i = 0; i < 8; i++){
            password = password + letterGetter();
        }

        return password;

    }

    //Write a method that takes an int length as an argument and creates an array of random eight-character words. The array should be the length passed in as an int. Return the array of passwords.

    //so the number of times the password is generated should be the length of the int length, all i need to do is call on the function password generator, inside of a for loop thta uses the int length and append them to the array. 

    public ArrayList<String> passwordGroups(int length) {

        //create string array empty, to have the passwords appended too, end of the for loop it needs to append password generator to the array, in the for loop it needs to itrate through to the length of the int length so for (int i = 0; i <= length; i++) underthat, append the password generator? or create a vairable that is the password generator, and append that, then idk? return the array :D!
        ArrayList<String> passwordGroup = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordGroup.add(passwordGenerator());
        }

        return passwordGroup;

    }









}