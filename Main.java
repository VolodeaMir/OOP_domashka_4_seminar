public class Main {
    public static void main(String[] args) {
        System.out.println();
        Calculator<Integer> intCalculator = new Calculator<>();
        System.out.println("Addition: " + intCalculator.sum(10, 5));
        System.out.println("Multiplication: " + intCalculator.multiply(10, 5));
        System.out.println("Division: " + intCalculator.divide(10, 5));
        System.out.println("Binary conversion: " + intCalculator.toBinary(10));

        System.out.println();

        Calculator<Double> doubleCalculator = new Calculator<>();
        System.out.println("Addition: " + doubleCalculator.sum(10.5, 5.3));
        System.out.println("Multiplication: " + doubleCalculator.multiply(10.5, 5.3));
        System.out.println("Division: " + doubleCalculator.divide(10.5, 5.3));
        System.out.println("Binary conversion: " + doubleCalculator.toBinary(10.5));
    }
}
