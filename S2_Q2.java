import java.util.Scanner;
import static java.lang.Math.atan;
import static java.lang.Math.sqrt;

class Fraction {
    int a;
    int b;

    public String add(int a, int b, int c, int d) {
//        String sum = (a*d + c*b) + "/" + d*b;
        String sum_gcd = gcd(a*d + c*b, d*b);
        return sum_gcd;
    }

    public String multiply(int a, int b, int c, int d) {
//        String product = a*c + "/" + b*d;
        String product_gcd = gcd(a*c, b*d);
        return product_gcd;
    }

    public String print(int a, int b) {
        String fraction = a + "/" + b;
        String fraction_gcd = gcd(a, b);
        return fraction_gcd;
    }

    public static String gcd(int a, int b) {
        int i;
        int j;
        int flag_a = 0;
        int flag_b = 0;
        System.out.println("fdsjkbksdfjgbjkbjkb");
        System.out.println(a);
        System.out.println(b);

        if (a < 0) {
//            a = (-1)*a;
            flag_a = 1;
        }
        if (b < 0) {
//            b = (-1)*b;
            flag_b = 1;
        }

        if (a < b) {
            i = a;
        }
        else {
            i = b;
        }

        for (j = 1 ; j <= i ; j++) {
            if (a % j == 0 && b % j == 0) {
                a = a / j;
                b = b / j;
            }
        }
        if (flag_a == 1 && flag_b == 0 || flag_a == 0 && flag_b == 1) {
            return "-" + a + "/" + b;
        }
        else {
            return a + "/" + b;
        }
    }
}

abstract class Complex {
    public String add(int a, int b, int c, int d) {
        return null;
    }

    public String multiply(int a, int b, int c, int d) {
        return null;
    }

    public String print(int a, int b) {
        return null;
    }

    public String argument(int a, int b) {
        return null;
    }

    public double magnitude(int a, int b) {
        return Double.parseDouble(null);
    }
}

class ComplexInteger extends Complex {
    @Override
    public String add(int a, int b, int c, int d) {
        String sum = (a + c) + " + " + (b + d) + "i";
        return sum;
    }

    @Override
    public String multiply(int a, int b, int c, int d) {
        String product = ((a * c) - (b * d)) + " + " + ((b * c) + (a * d)) + "i";
        return product;
    }

    @Override
    public String print(int a, int b) {
        String complex = a + " + " + b + "i";
        return complex;
    }

    @Override
    public String argument(int a, int b) {
        if (b == 0) {
            return "Denominator cannot be zero.";
        }
        double arg = atan(b / a);
        return (arg*180)/Math.PI + " degrees";
    }

    @Override
    public double magnitude(int a, int b) {
        double c = sqrt(a * a + b * b);
        return c;
    }
}

class ComplexFraction extends Complex {
    public String add(int a, int b, int c, int d, int p, int q, int r, int s) {
        String sum = (a*q + b*p) + "/" + b*q + " + " + (c*s + d*r) + "/" + d*s + "i";
        return sum;
    }

    public String multiply(int a, int b, int c, int d, int p, int q, int r, int s) {
//        String product = ((a*p / b*q) - (c*r / d*s)) + ((p*c / d*q) + (a*r / b*s)) + "i";
//        (apds - bqcr) / bqds + (pcbs + dqar) / bsdq
//        String product = (a*p*d*s - b*q*c*r) + "/" + b*q*d*s + " + " + (p*c*b*s + d*q*a*r) + "/" + b*s*d*q + "i";
//      String product_gcd = "-" + Fraction.gcd((b*q*c*r - a*p*d*s), b*q*d*s) + " + " + Fraction.gcd((p*c*b*s + d*q*a*r), b*s*d*q) + "i";
        String product_gcd = Fraction.gcd((a*p*d*s - b*q*c*r), b*q*d*s) + " + " + Fraction.gcd((p*c*b*s + d*q*a*r), b*s*d*q) + "i";
        return product_gcd;
    }

    public String print(int a, int b, int c, int d) {
        String complex = a + "/" + b + " + " + c + "/" + d + "i";
        return complex;
    }

    public String argument(double a, double b, double c, double d) {
        if (b == 0 || d == 0 ) {
            return "Denominator cannot be zero";
        }
        double arg = atan((a/b) / (c/d));
        return (arg*180)/Math.PI + " degrees";
    }

    public double magnitude(double a, double b, double c, double d) {
        double magnitude = sqrt(((a*a*d*d) + (b*b*c*c)) / (b*b*d*d));
        return magnitude;
    }
}

public class S2_Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Num and Denom of 1st Fraction: ");
        int num_1 = scanner.nextInt();
        int denom_1 = scanner.nextInt();

        System.out.println("Enter the Num and Denom of 2nd Fraction: ");
        int num_2 = scanner.nextInt();
        int denom_2 = scanner.nextInt();

        Fraction f = new Fraction();

        System.out.println("Fraction 1 to the Lowest Form: " + f.gcd(num_1, denom_1));
        System.out.println("Fraction 2 to the Lowest Form: " + f.gcd(num_2, denom_2));
        System.out.println("Sum: " + f.add(num_1, denom_1, num_2, denom_2));
        System.out.println("Product: " + f.multiply(num_1, denom_1, num_2, denom_2));


        System.out.println("Enter the Real and Imaginary of 1st Complex Number (Integer): ");
        int real_1 = scanner.nextInt();
        int imaginary_1 = scanner.nextInt();

        System.out.println("Enter the Real and Imaginary of 2nd Complex Number (Integer): ");
        int real_2 = scanner.nextInt();
        int imaginary_2 = scanner.nextInt();

        ComplexInteger ci = new ComplexInteger();

        System.out.println("Sum: " + ci.add(real_1, imaginary_1, real_2, imaginary_2));
        System.out.println("Product: " + ci.multiply(real_1, imaginary_1, real_2, imaginary_2));
        System.out.println("Argument of 1st Complex Number: " + ci.argument(real_1, imaginary_1));
        System.out.printf("Magnitude of 1st Complex Number: %.2f\n", ci.magnitude(real_1, imaginary_1));
        System.out.println("Argument of 2nd Complex Number: " + ci.argument(real_2, imaginary_2));
        System.out.printf("Magnitude of 2nd Complex Number: %.2f\n", ci.magnitude(real_2, imaginary_2));


        System.out.println("Enter the Real and Imaginary of 1st Complex Number (Fraction): ");
        int real_num_3 = scanner.nextInt();
        int real_denom_3 = scanner.nextInt();
        int imaginary_num_3 = scanner.nextInt();
        int imaginary_denom_3 = scanner.nextInt();

        System.out.println("Enter the Real and Imaginary of 2nd Complex Number (Fraction): ");
        int real_num_4 = scanner.nextInt();
        int real_denom_4 = scanner.nextInt();
        int imaginary_num_4 = scanner.nextInt();
        int imaginary_denom_4 = scanner.nextInt();

        ComplexFraction cf = new ComplexFraction();

        System.out.println("Sum: " + cf.add(real_num_3, real_denom_3, imaginary_num_3, imaginary_denom_3, real_num_4, real_denom_4, imaginary_num_4, imaginary_denom_4));
        System.out.println("Product: " + cf.multiply(real_num_3, real_denom_3, imaginary_num_3, imaginary_denom_3, real_num_4, real_denom_4, imaginary_num_4, imaginary_denom_4));
        System.out.println("Argument of 1st Complex Number: " + cf.argument(real_num_3, real_denom_3, imaginary_num_3, imaginary_denom_3));
        System.out.printf("Magnitude of 1st Complex Number: %.2f\n", cf.magnitude(real_num_3, real_denom_3, imaginary_num_3, imaginary_denom_3));
        System.out.println("Argument of 2nd Complex Number: " + cf.argument(real_num_4, real_denom_4, imaginary_num_4, imaginary_denom_4));
        System.out.printf("Magnitude of 2nd Complex Number: %.2f\n", cf.magnitude(real_num_4, real_denom_4, imaginary_num_4, imaginary_denom_4));
    }
}