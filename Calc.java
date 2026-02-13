public class Calc {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Calc <num1> <num2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println(sum);
        System.out.println(subtraction);
        System.err.println(multiplication);
        
    }
}