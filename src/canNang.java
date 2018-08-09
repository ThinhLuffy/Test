import java.util.Scanner;

public class canNang {
    public static void main(String[] args) {

        System.out.println("-----Kiem tra Can Nang Co The ------");

        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;

        System.out.println("Nhap vao can nang cua ban (kg): ");
        weight = scanner.nextDouble();

        System.out.println("Nhap vao chieu cao cua ban (kg): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        //Muon dung String trong 1 doan nao do thi phai dung "printf"

        System.out.printf("%-20s%s", "bmi", "Interpretation");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

        System.out.println("------ Thank you ------");
    }
}
