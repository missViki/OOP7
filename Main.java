public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, 2);
        ComplexNumber b = new ComplexNumber(3, 7);

        Calculator.add(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }
}