import java.util.logging.LogManager;

public class Calculator {
    private static final Logger logger = LogManager.getLogger();

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.info("Сложение чисел {} и {}", a, b);
        ComplexNumber sum = a.add(b);
        logger.info("Результат: {}", sum);
        return sum;
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.info("Умножение чисел {} и {}", a, b);
        ComplexNumber product = a.multiply(b);
        logger.info("Результат: {}", product);
        return product;
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        if (b.getRealPart() == 0 && b.getImaginaryPart() == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        logger.info("Деление чисел {} и {}", a, b);
        ComplexNumber quotient = a.divide(b);
        logger.info("Результат: {}", quotient);
        return quotient;
    }
}
