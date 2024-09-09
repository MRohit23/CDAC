/* Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.
*/
public class DiscountCalculator {
    public static void main(String[] args) {
        double totalPurchase = 750;
        boolean MembershipCard = true;

        double discountPercentage;

        // Calculate discount on the total purchase amount
        if (totalPurchase >= 1000) {
            discountPercentage = 20;
        } else if (totalPurchase >= 500) {
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }

        // Increase discount by 5% if the user has a membership card
        if (MembershipCard) {
            discountPercentage += 5;
        }

        // Calculate final discount amount
        double discountAmount = (discountPercentage / 100) * totalPurchase;
        double finalAmount = totalPurchase - discountAmount;

        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount after Discount: Rs." + finalAmount);
    }
}
