// Example test cases:
/* 
move("hello") ➞ "ifmmp"
move("bye") ➞ "czf"
move("welcome") ➞ "xfmdpnf"
 */


class changeLetter{
    public static void main(String[] args){
        // check that there is exactly one command line input.
        if (args.length != 1){
            System.out.println("Usage: java changeLetter <\"word\">");
            return;
        }
    }
}