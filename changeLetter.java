
class changeLetter{
    public static void main(String[] args){
        // check that there is exactly one command line input.
        if (args.length != 1 || containsPunctuationOrNumbers(args[0]) || args[0].equals(" ")){
            System.out.println("Usage: java changeLetter <\"word\"> (without puncutation)");
            return;
        }

        // get the string from the command line argument.
        String word = args[0];

        // call the move function with the input word.
        move(word);
    }
    
    // method to shift each ascii code for each character in the word by 1. 
    public static void move(String word){
        // initialise a string to hold the final transformed word.
        String newString = "";
        
        // for each character in the word,
        for (int i = 0; i <= word.length() - 1; i++){
            char currentChar = word.charAt(i); // get the character at index i,
            int nextAsciiCode; // initialise a variable to get the next ascii code.
            char nextChar; // initailise a variable to get the next character (using the ascii code).
    
            // if the character at index i is not lowercase 'z',
            if (currentChar != 'z'){
                // increment the ascii code by 1, and convert it to a character.
                nextAsciiCode = currentChar + 1;
                nextChar = (char)nextAsciiCode;
            }
            // else if the character at index i is a lowercase 'z',
            else{
                // set the next character as uppercase 'A'.
                nextChar = 'A';
            }
            
            // append the incremented character to the new string.
            newString = newString + nextChar;
            // System.out.println(currentChar + " " + nextChar); // DEBUG
        }

        // Print the shifted word to console.
        System.out.println(newString);
    }

    // Function to check if the string contains any punctuation
    public static boolean containsPunctuationOrNumbers(String word) {
        // Regular expression to match any punctuation
        String punctuationRegex = ".*[\\p{Punct}\\d].*";
        return word.matches(punctuationRegex);
    }
}