public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero! "+ e.getMessage());
            z = Integer.MAX_VALUE; // Or handle the error in a way that suits your application
        }
        System.out.println(z);
    }
}