public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.realPart + other.realPart;
        double imaginarySum = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double imaginaryProduct = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double realNumerator = this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart;
        double imaginaryNumerator = this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart;
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double realQuotient = realNumerator / denominator;
        double imaginaryQuotient = imaginaryNumerator / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }
}
