import java.util.Scanner;
public class Bill {
    private int hours;
    private int minutes;
    private double fee;
    private int code;
    public void inputTimeWorked() {
        System.out.println("Enter number of full hours worked");
        System.out.println("followed by number of minutes:");
        Scanner keyboard = new Scanner(System. in );
        hours = keyboard.nextInt();
        minutes = keyboard.nextInt();
    }
    private double computeFee(int hoursWorked, int minutesWorked) {
        if(Coupon()==false){
        minutesWorked = hoursWorked * 60 + minutesWorked;
        int quarterHours = minutesWorked / 15;
        return quarterHours * 150.0;
        }
    else{
            minutesWorked = hoursWorked * 60 + minutesWorked;
            int quarterHours = minutesWorked / 15;
            return quarterHours * 135.0;
    }}
    public void updateFee() {
        fee = computeFee(hours, minutes);
    }
    public boolean Coupon(){
        System.out.println("Enter a coupon number:" );
        Scanner keyboard=new Scanner(System. in);
        code = keyboard.nextInt();
        if(code==1234){
            System.out.println("your coupon is valid. (10% discount)");
            return true;
        }
        else{
            System.out.println("your coupon is not valid.");
            return false;
        }
    }

    public void outputBill() {
        if( Coupon()==false){
        System.out.println("Time worked: ");
        System.out.println(hours + " hours and " + minutes + " minutes");
        System.out.println("Rate: $" + 150.00 + " per quarter hour.");
        System.out.println("Amount due: $" + fee);
    }
        else{
            System.out.println("Time worked: ");
            System.out.println(hours + " hours and " + minutes + " minutes");
            System.out.println("Rate: $" + 135.00 + " per quarter hour.");
            System.out.println("Amount due: $" + fee);
        }

}}
