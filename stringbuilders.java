import java.util.Scanner;

public class stringbuilders{
    public static void main(String[] args){

        //Declaring StringBuilder using StringBuilder Object
        StringBuilder name = new StringBuilder("My name is Krishna");

        //printing string
        System.out.println(name);

        //appending any thing in existing string 
        name.append(" Dwivedi");
        System.out.println(name);

        // replacing any char in existing string
        name.setCharAt(0,'R');
        System.out.println(name);

        // deleting a part of string using .delete function
        name.delete(0, 11);
        System.out.println(name); 

    }
}