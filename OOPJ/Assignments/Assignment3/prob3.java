public class prob3 {
    public static void main(String[] args) {
        BMITracker obj = new BMITracker();
        obj.acceptRecord(65.60, 1.69);
        obj.calculateBMI();
        obj.classifyBMI();
        obj.printRecord();  
    }
}

class BMITracker {
    private double weight;
    private double height;
    private double BMI;
    private String bmiCategory;

    public void acceptRecord(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        this.BMI = this.weight / (this.height * this.height);
    }

    public void classifyBMI() {
        if (this.BMI < 18.5) {
            this.bmiCategory = "Underweight";
        } else if (this.BMI >= 18.5 && this.BMI < 24.9) {
            this.bmiCategory = "Normal Weight";
        } else {
            this.bmiCategory = "Overweight";
        }
    }

    public void printRecord() {
        System.out.println("BMI: " + this.BMI);
        System.out.println("BMI Category: " + this.bmiCategory);
    }
}