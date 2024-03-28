public interface Tax {
    final double TAX_PERCENT = 0.05;
    abstract double calculateTax(double salary);
}
