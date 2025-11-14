import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");

            if (!sc.hasNextLine()) {
                break;  // no more input from tester → stop
            }

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit 0")) {
                break;
            }

            System.out.println(input + ": command not found");
        }

        sc.close();
    }
}
