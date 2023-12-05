import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        //numbers to text with Ascii
        //Makes a list of numbers and then turns each Number into its own Char/letter in a for loop that repeats the length of the list as many times taking the index for i which adds 1 each loop
        Integer[] AsciiNumbers = {89, 111, 117, 114, 32, 112, 114, 111, 103, 114, 97, 109, 32, 115, 104, 111, 117, 108, 100, 32, 102, 105, 114, 115, 116, 32, 100, 101, 99, 111, 100, 101, 32, 116, 104, 105, 115, 32, 98, 108, 111, 99, 107, 32, 111, 102, 32, 116, 101, 120, 116, 32, 97, 110, 100, 32, 100, 105, 115, 112, 108, 97, 121, 32, 105, 116, 46, 32, 84, 104, 101, 110, 44, 32, 112, 114, 111, 109, 112, 116, 32, 116, 104, 101, 32, 117, 115, 101, 114, 32, 102, 111, 114, 32, 97, 32, 110, 97, 109, 101, 46, 32, 84, 97, 107, 101, 32, 116, 104, 97, 116, 32, 110, 97, 109, 101, 32, 97, 110, 100, 32, 111, 117, 116, 112, 117, 116, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 58, 32, 84, 104, 101, 32, 110, 97, 109, 101, 32, 105, 110, 32, 114, 101, 118, 101, 114, 115, 101, 44, 32, 116, 104, 101, 32, 82, 101, 118, 101, 114, 115, 101, 32, 111, 114, 100, 101, 114, 32, 105, 110, 32, 65, 76, 76, 32, 67, 65, 80, 73, 84, 65, 76, 83, 44, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 117, 115, 105, 110, 103, 32, 67, 97, 77, 101, 76, 32, 99, 65, 115, 69, 44, 32, 97, 110, 100, 32, 102, 105, 110, 97, 108, 108, 121, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 105, 110, 32, 65, 83, 67, 73, 73, 46, 32, 68, 79, 32, 78, 79, 84, 32, 85, 83, 69, 32, 65, 78, 89, 32, 83, 84, 82, 73, 78, 71, 32, 77, 65, 78, 73, 80, 85, 76, 65, 84, 73, 79, 78, 32, 77, 69, 84, 72, 79, 68, 83, 46, 13, 10};
        for (int i = 0; i < AsciiNumbers.length; i++) {
            int AsciiNumberInList = AsciiNumbers[i];
            char AsciiNumbertoChar = (char) AsciiNumberInList;
            System.out.print(AsciiNumbertoChar);
        }


        //Name
        //uses scanner to input name and then scans and prints it out
        System.out.print("what is your name: ");
        String Name = scan.nextLine();
        System.out.println(Name);


        //Backwards Name
        //takes the Name variable and does a for loop that repeats as many times as the name length and takes the index i which is the name length and appends that letter to the backwards variable and then printing it out
        //also loops though the for loop by subtracting 1 and starting at the Name length number so it backwards thought the name string
        String NameBackwards = "";
        for (int i = Name.length() - 1; i > -1; i--) {
             NameBackwards = NameBackwards + Name.charAt(i);
        }
        System.out.println(NameBackwards);


        //Backwards with Capitol
        //takes the BacksName variable and makes it upper case and prints it out
        String NameBackwardsCapitol = NameBackwards.toUpperCase();
        System.out.println(NameBackwardsCapitol);


        //Name into Camel Case
        //makes a string named NameCamelCase and appends the first letter of the Name in uppercase then goes through a for loop while adding 2 each time and starting at 2 while going until it is greater then the Name length
        //in the for loop it adds the lower case of the Names next letter and then adds the Names next letter in uppercase
        //after for loop checks if the length of the Camel Case Name is the same as the Name length if not it appends the last letter of the Name length and then prints it out
        String NameCamelCase = "";
        NameCamelCase = NameCamelCase + Name.toUpperCase().charAt(0);
        for (int i = 2; i < Name.length(); i = i + 2) {
            NameCamelCase = NameCamelCase + Name.toLowerCase().charAt(i-1);
            NameCamelCase = NameCamelCase + Name.toUpperCase().charAt(i);
            }
        if (Name.length() != NameCamelCase.length()){
            NameCamelCase = NameCamelCase + Name.toLowerCase().charAt(Name.length() - 1);
        }
        System.out.println(NameCamelCase);


        //Name into Ascii
        //repeats a for loop as many times as the Name Length then makes a variable NameCharInString and sets it to the first Name letter and then sets it equal to a integer and prints it out therefore getting the Ascii number of the letter
        for (int i = 0; i < Name.length(); i++) {
            char NameCharInString = Name.charAt(i);
            int NameCharToNumber = NameCharInString;
            System.out.print(NameCharToNumber + " ");
        }
    }
}