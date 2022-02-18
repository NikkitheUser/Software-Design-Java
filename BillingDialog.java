import java.util.Scanner;
public class BillingDialog {
    public static void main(String[] args) {

        System.out.println("Welcome to CSUMB software house!");

        System.out.println("Enter number of full hours worked followed by number in minuets:");

        Bill yourBill = new Bill();

        yourBill.inputTimeWorked();
        yourBill.Coupon();

        yourBill.updateFee();

        yourBill.outputBill();

        System.out.println("Thanks for doing business with us.");


    }
}
