//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Degree_Error extends Exception{
//    public Degree_Error(String msg) {
//        super(msg);
//    }
//    @Override
//    public String toString() {
//        return super.getMessage();
//    }
//}
//
//abstract class Polynomial<T> {
//    private int degree;
//    private ArrayList<T> end;
//    private T a;
//    private ArrayList<T> b;
//
//    public Polynomial(T a, ArrayList<T> b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public ArrayList<T> getEnd() {
//        return end;
//    }
//
//    abstract public ArrayList<T> print(T a, ArrayList<T> b);
//    abstract public void addPoly(ArrayList<T> c, ArrayList<T> b);
//    abstract public void subPoly(ArrayList<T> c, ArrayList<T> b);
//    abstract public void gradient(ArrayList<T> b, int a);
//}
//
//class PolyInt extends Polynomial<Integer> {
//    public PolyInt(Integer a, ArrayList<Integer> b) {
//        super(a, b);
//    }
//
//    @Override
//    public ArrayList<Integer> print(Integer a, ArrayList<Integer> b) {
//        System.out.println("Coefficients: " + b);
//        return this.getEnd();
//    }
//
//    @Override
//    public void addPoly(ArrayList<Integer> a, ArrayList<Integer> b) {
//        System.out.println("Sum: ");
//        // Adding iteratively
//        int length = Math.min(a.size(), b.size());
//        ArrayList sum_array = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            int sum = a.get(i) + b.get(i);
//            sum_array.add(sum);
//        }
//        System.out.println(sum_array);
//    }
//
//    @Override
//    public void subPoly(ArrayList<Integer> a, ArrayList<Integer> b) {
//        System.out.println("Difference: ");
//        // Subtracting iteratively
//        int length = Math.min(a.size(), b.size());
//        ArrayList diff_array = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            int diff = a.get(i) - b.get(i);
//            diff_array.add(diff);
//        }
//        System.out.println(diff_array);
//    }
//
//    @Override
//    public void gradient(ArrayList<Integer> a, int b) {
//        int sum = 0;
//        for (int i = 0 ; i < a.size() ; i++) {
//            double grad = a.get(i) * i * Math.pow(b, (i-1));
//            sum += grad;
//        }
//        System.out.println("Gradient: " + sum);
//    }
//}
//
//class PolyDouble extends Polynomial<Double> {
//    public PolyDouble(Double a, ArrayList<Double> b) {
//        super(a, b);
//    }
//
//    public ArrayList<Double> print(Double a, ArrayList<Double> b) {
//        System.out.println("Coefficients: " + b);
//        return this.getEnd();
//    }
//
//    @Override
//    public void addPoly(ArrayList<Double> a, ArrayList<Double> b) {
//        System.out.println("Sum: ");
//        // Adding iteratively
//        int length = Math.min(a.size(), b.size());
//        ArrayList sum_array = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            double sum = a.get(i) + b.get(i);
//            sum_array.add(sum);
//        }
//        System.out.println(sum_array);
//    }
//
//    @Override
//    public void subPoly(ArrayList<Double> a, ArrayList<Double> b) {
//        System.out.println("Difference: ");
//        // Subtracting iteratively
//        int length = Math.min(a.size(), b.size());
//        ArrayList diff_array = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            double diff = a.get(i) - b.get(i);
//            diff_array.add(diff);
//        }
//        System.out.println(diff_array);
//    }
//
//    @Override
//    public void gradient(ArrayList<Double> a, int b) {
//        int sum = 0;
//        for (int i = 0 ; i < a.size() ; i++) {
//            double grad = a.get(i) * i * Math.pow(b, (i-1));
//            sum += grad;
//        }
//        System.out.println("Gradient: " + sum);
//    }
//}
//
//public class S3_Q2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the degree: ");
//        int degree1 = scanner.nextInt();
//        try {
//            if (degree1 < 0) {
//                throw new Degree_Error("Degree has to be positive value");
//            }
//        }
//        catch (Degree_Error err) {
//            System.out.println("Error: " + err.getMessage());
//        }
//
//
//
//        ArrayList<Integer> coeff1 = new ArrayList<>();
//        for (int i = 0; i <= degree1; i++) {
//            System.out.println("Enter coefficients: ");
//            coeff1.add(scanner.nextInt());
//        }
//
//
//
//        System.out.println("Enter the degree: ");
//        int degree2 = scanner.nextInt();
//        try {
//            if (degree2 < 0) {
//                throw new Degree_Error("Degree has to be positive value");
//            }
//        }
//        catch (Degree_Error err) {
//            System.out.println("Error: " + err.getMessage());
//        }
//
//        ArrayList<Integer> coeff2 = new ArrayList<>();
//        for (int i = 0; i <= degree2; i++) {
//            System.out.println("Enter coefficients: ");
//            coeff2.add(scanner.nextInt());
//        }
//
//        System.out.println("Enter the gradient: ");
//        int grad_int = scanner.nextInt();
//
//        PolyInt p1 = new PolyInt(degree1, coeff1);
//        p1.print(degree1, coeff1);
//
//        PolyInt p2 = new PolyInt(degree2, coeff2);
//        p1.print(degree2, coeff2);
//
//        p1.addPoly(coeff1, coeff2);
//        p1.subPoly(coeff1, coeff2);
//        p1.gradient(coeff1, grad_int);
//        p2.gradient(coeff2, grad_int);
//
//
//        System.out.println("Enter the degree (Double): ");
//        double degree_d1 = scanner.nextDouble();
//
//        ArrayList<Double> coeff_d1 = new ArrayList<>();
//        for (int i = 0; i <= degree_d1; i++) {
//            System.out.println("Enter coefficients (Double): ");
//            coeff_d1.add(scanner.nextDouble());
//        }
//
//        System.out.println("Enter the degree (Double): ");
//        double degree_d2 = scanner.nextInt();
//
//        ArrayList<Double> coeff_d2 = new ArrayList<>();
//        for (int i = 0; i <= degree_d2; i++) {
//            System.out.println("Enter coefficients (Double): ");
//            coeff_d2.add(scanner.nextDouble());
//        }
//
//        System.out.println("Enter the gradient: ");
//        int grad_int_d = scanner.nextInt();
//
//        PolyDouble pd1 = new PolyDouble(degree_d1, coeff_d1);
//        pd1.print(degree_d1, coeff_d1);
//
//        PolyDouble pd2 = new PolyDouble(degree_d2, coeff_d2);
//        pd2.print(degree_d2, coeff_d2);
//
//        pd1.addPoly(coeff_d1, coeff_d2);
//        pd1.subPoly(coeff_d1, coeff_d2);
//        pd1.gradient(coeff_d1, grad_int_d);
//        pd2.gradient(coeff_d2, grad_int_d);
//    }
//}



import java.util.ArrayList;
import java.util.Scanner;

class Degree_Error extends Exception {
    public Degree_Error(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}

abstract class Polynomial<T> {
    protected int degree;
    protected ArrayList<T> coefficients;

    public Polynomial() {
        coefficients = new ArrayList<>();
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree: ");
        degree = scanner.nextInt();

        try {
            if (degree < 0) {
                throw new Degree_Error("Degree has to be a non-negative value");
            }
        } catch (Degree_Error err) {
            System.out.println("Error: " + err.getMessage());
            return;
        }

        System.out.println("Enter coefficients:");
        for (int i = 0; i <= degree; i++) {
            System.out.print("Coefficient for x^" + i + ": ");
            coefficients.add((T) scanner.next());
        }
    }

    public void print() {
        System.out.print("Polynomial coefficients: ");
        for (int i = 0; i <= degree; i++) {
            System.out.print(coefficients.get(i) + " ");
        }
        System.out.println();
    }

    abstract public void addPolynomial(Polynomial<T> other);
    abstract public void subtractPolynomial(Polynomial<T> other);
}

class PolyInt extends Polynomial<Integer> {
    @Override
    public void addPolynomial(Polynomial<Integer> other) {
        if (this.degree != other.degree) {
            System.out.println("Polynomials must have the same degree for addition.");
            return;
        }

        for (int i = 0; i <= this.degree; i++) {
            if (coefficients.get(i) instanceof Integer && other.coefficients.get(i) instanceof Integer) {
                coefficients.set(i, coefficients.get(i) + other.coefficients.get(i));
            } else {
                System.out.println("Coefficients have incompatible types for addition.");
                return;
            }
        }
    }

    @Override
    public void subtractPolynomial(Polynomial<Integer> other) {
        if (this.degree != other.degree) {
            System.out.println("Polynomials must have the same degree for subtraction.");
            return;
        }

        for (int i = 0; i <= this.degree; i++) {
            if (coefficients.get(i) instanceof Integer && other.coefficients.get(i) instanceof Integer) {
                coefficients.set(i, coefficients.get(i) - other.coefficients.get(i));
            } else {
                System.out.println("Coefficients have incompatible types for subtraction.");
                return;
            }
        }
    }
}

class PolyDouble extends Polynomial<Double> {
    @Override
    public void addPolynomial(Polynomial<Double> other) {
        if (this.degree != other.degree) {
            System.out.println("Polynomials must have the same degree for addition.");
            return;
        }

        for (int i = 0; i <= this.degree; i++) {
            if (coefficients.get(i) instanceof Double && other.coefficients.get(i) instanceof Double) {
                coefficients.set(i, coefficients.get(i) + other.coefficients.get(i));
            } else {
                System.out.println("Coefficients have incompatible types for addition.");
                return;
            }
        }
    }

    @Override
    public void subtractPolynomial(Polynomial<Double> other) {
        if (this.degree != other.degree) {
            System.out.println("Polynomials must have the same degree for subtraction.");
            return;
        }

        for (int i = 0; i <= this.degree; i++) {
            if (coefficients.get(i) instanceof Double && other.coefficients.get(i) instanceof Double) {
                coefficients.set(i, coefficients.get(i) - other.coefficients.get(i));
            } else {
                System.out.println("Coefficients have incompatible types for subtraction.");
                return;
            }
        }
    }
}

public class S3_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PolyInt polyInt1 = new PolyInt();
        System.out.println("For the first polynomial (Integer coefficients):");
        polyInt1.takeInput();
        polyInt1.print();

        PolyInt polyInt2 = new PolyInt();
        System.out.println("For the second polynomial (Integer coefficients):");
        polyInt2.takeInput();
        polyInt2.print();

        polyInt1.addPolynomial(polyInt2);
        System.out.println("After adding:");
        polyInt1.print();

        polyInt1.subtractPolynomial(polyInt2);
        System.out.println("After subtracting:");
        polyInt1.print();

        PolyDouble polyDouble1 = new PolyDouble();
        System.out.println("For the first polynomial (Double coefficients):");
        polyDouble1.takeInput();
        polyDouble1.print();

        PolyDouble polyDouble2 = new PolyDouble();
        System.out.println("For the second polynomial (Double coefficients):");
        polyDouble2.takeInput();
        polyDouble2.print();

        polyDouble1.addPolynomial(polyDouble2);
        System.out.println("After adding:");
        polyDouble1.print();

        polyDouble1.subtractPolynomial(polyDouble2);
        System.out.println("After subtracting:");
        polyDouble1.print();
    }
}