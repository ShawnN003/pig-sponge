public class Pig {
    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    /**
     * Step 1: Insert each word in an array of strings && Splitting the String by spaces to get each letter 
     * Step 3: Check the first letter of each word if its a vowel 
     * (if true- shift it to the end if false- add it to the new String by concatinating)
     * Step 4: Add that word in a new String by concatinating and add ay at the end of each word
     * 
     * 
     * Crucial Steps I missed:
     * -Inserting each word into an array 
     * -Adding all words in one consecutive string at the end 
     * Deleting the first word using the substring method: word = arr[i].substring(1); 
     * 
     * 
     * @param sentence
     * @return
     */

            // if (sentence.charAt(0) == 'a' || sentence.charAt(0) == 'e' ||sentence.charAt(0) == 'i' 
            //     || sentence.charAt(0) == 'u' || sentence.charAt(0) == 'o')
            // {

            // }
    public static String pigLatin(String sentence) {
        String word = " ";
        String result = " ";
        char firstLetter = ' ';

        String arr [] = sentence.split(" ");    //inserting each word seperated by a space in a string array

        for(int i = 0; i <=arr.length-1; i++)    //Looping through the array of words from the sentence
        {
            if(arr[i].startsWith("a") || arr[i].startsWith("e") || arr[i].startsWith("i") ||
            arr[i].startsWith("u") || arr[i].startsWith("o"))
            {
                word = arr[i];    //when the word starts with a vowel, insert it in a string 
            }
            else     
            {
                firstLetter = arr[i].charAt(0);    //insert the first letter in a variable
                word = arr[i].substring(1);    //taking out the first letter from the word 
                word+= firstLetter;    //adding the first letter at the end of the string 
                word+= "ay";
            }
            result+= word;    //adding each needed word into a string sentence
            result+= " ";
        }
        
        return result.trim();    //cutting out any extra spaces
    }

    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  