import java.util.*;
public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }

    public String toTitleCase() {
        StringBuilder result = new StringBuilder(str.length());
        String[] words = str.split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }

            result.append(" ");
        }

        return result.toString().trim();
    }

    public String extractNFromRight(int n) {
        if (n >= str.length()) {
            return str;
        }

        return str.substring(str.length() - n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        MyString myString = new MyString(str);
        char ch;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Reverse string");
            System.out.println("2. String in Titlecase");
            System.out.println("3. Extract N-characters from right-end of the string");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Reversed string: " + myString.reverse());
                    break;
                case 2:
                    System.out.println("Titlecased string: " + myString.toTitleCase());
                    break;
                case 3:
                    System.out.print("Enter N: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Extracted " + n + " characters from right: " + myString.extractNFromRight(n));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("Do you want to continue?(press=y)");
            ch=scanner.next().charAt(0);
        }while(ch=='y');
    }
}
