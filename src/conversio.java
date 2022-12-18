import java.util.Scanner;

public class conversio {
    public static void main(String[] args) {
        Scanner conversion = new Scanner(System.in);
        double centimetricValue = conversion.nextDouble();
        double toMeter = centimetricValue * 100;
        double toKiloMetre = toMeter * 1000;
        double toInch = centimetricValue / 2.54;
        double toFeet = centimetricValue / 30.5;
        System.out.println("the value you entered is" + centimetricValue);
        System.out.println("which is" + toMeter + "metres");
        System.out.println(toKiloMetre + "Kilo metres");
        System.out.println(toInch + "inches");
        System.out.println(toFeet + "feet");



        }

    }


