public class reversestring{
    public static void main(String args[]){

        //Creating a StringBuilder object named as name
        StringBuilder name = new StringBuilder("Krishna Dwivedi");

        //printing the original String 
        System.out.println("Original String :"+name);

        //using for loop to reverse the string
        for(int i = 0 ; i <= name.length()/2 ; i++){
           
            // storing i th index in first variable
            int first = i ;

            // storing "length -1 - i th"  index at last variable
            int last = name.length() - 1 - i;
            
            // storing character of i th index in firstchar
            char firstchar = name.charAt(i);

            // storing character of "length -1 - i th" index in lastchar
            char lastchar = name.charAt(name.length() -1 - i );

            // swaping the characters of i th index and "length -1 - i th" index
            name.setCharAt(first,lastchar);
            name.setCharAt(last, firstchar);

        }

        //printing the reversed String
        System.out.print("Reversed String :"+name);
       
    }
}