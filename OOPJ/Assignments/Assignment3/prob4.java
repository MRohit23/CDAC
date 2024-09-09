public class prob4 {
    public static void main(String[] args) {
        DiscountCalculator obj = new DiscountCalculator();
        obj.acceptRecord(1000.00, 10.00);
        obj.calculateDiscount();  
        obj.printRecord();
    }
}

class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double finalPrice;

    public void acceptRecord(double originalPrice, double discountRate) {
        System.out.println("Enter the original Price for item");
        this.originalPrice = originalPrice;
        System.out.println("Enter the discount rate");
        this.discountRate = discountRate;
    }

    public void calculateDiscount() {
        double discountAmount = this.originalPrice * (this.discountRate / 100);
        this.finalPrice = this.originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.println("The final price after discount of"+ this.discountRate+"% is: " + this.finalPrice);
    }
}