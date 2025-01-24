
// Program 10: Simple Class with Methods
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 10));
        System.out.println("Product: " + calc.multiply(4, 7));
    }
}
