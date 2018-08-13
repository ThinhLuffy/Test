import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.println("Enter year: ");
        year = input.nextInt();

        if (year % 4== 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Nam nhuan la:  " + year);
                }
                else {
                    System.out.println("Nam do khong phai nam nhuan la: "+ year);
                }
            }
            else {
                System.out.println("Nam do la nam nhuan la: " + year);
            }
        }
        else {
            System.out.println("Nam do khong phai la nam nhuan la: "+ year);
        }
    }
}
