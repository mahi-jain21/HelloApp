public class HelloApp6 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            String names = "";

            // Enhanced for loop
            for (String arg : args) {
                names += arg + ", ";
            }

            // Remove trailing comma and space using substring
            names = names.substring(0, names.length() - 2);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}