import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        //Remember to put this into case and functions in the future to make it look tidy
        while (true) {   //REPL 
            System.out.print("$ ");   //for printing the first prompt 

            if (!sc.hasNextLine()) {  //it check if there is a next input if not then it breaks the loop and exits
                break;  
            }

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit 0")) {
                break;
            }

            //For checking if the first word is echo or not
            if(input.startsWith("echo "))   {
                System.out.println(input.substring(5)); //This will make sure the echo doesnot print with the word
            }
            
            if(input.startsWith("type"))    {
                System.out.println(input.substring(5) +" " +"is a shell builtin");
            }

            else
                System.out.println(input + ": command not found");
        }

        sc.close();
    }
}
