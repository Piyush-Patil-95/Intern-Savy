import java.util.Scanner;

public class Temp_conv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n*****Temperature Converter******\n");
        System.out.println("Enter 1 to convert Celsius to Fahrenheit : ");
        System.out.println("Enter 2 to convert Fahrenheit to Celsius : ");
        System.out.print("\nEnter choice : ");
        int ans = scan.nextInt();
        System.out.print("Enter temperature value : ");
        float value = scan.nextFloat();
        if (ans == 1) {
            float value1 = (float) ((value * (1.8)) + 32);
            System.out.print("The temperature in Fahrenheit is : " + value1 + "F");
        }
        if (ans == 2) {
            float value2 = (float) (value - 32);
            float value3 = (float) (value2 * (5) / 9);
            System.out.print("The temperature in Celsius is : " + value3 + "C");
        }

        scan.close();
    }

}