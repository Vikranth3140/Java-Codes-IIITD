import java.util.Scanner;

abstract class Shape {
    abstract double calc_area();
    abstract double calc_perim();
}
class Circle extends Shape {
    private int x;
    private int y;
    private int radius;
    private double perimeter;
    private double area;

    @Override
    public double calc_perim() {
        perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    @Override
    public double calc_area() {
        area = 3.14*radius*radius;
        return area;
    }

    boolean checkIntersection(Circle circle) {
        double distance = Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y));
        return distance < (radius + circle.radius);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}

class Triangle extends Shape {
    private int x_1;
    private int x_2;
    private int x_3;
    private int y_1;
    private int y_2;
    private int y_3;
    private double side_1;
    private double side_2;
    private double side_3;
    private double perimeter;
    private double area;

    public Triangle(int x_1, int x_2, int x_3, int y_1, int y_2, int y_3) {
        this.x_1 = x_1;
        this.x_2 = x_2;
        this.x_3 = x_3;
        this.y_1 = y_1;
        this.y_2 = y_2;
        this.y_3 = y_3;

        this.side_1 = Math.sqrt(((x_2 - x_1)*(x_2 - x_1)) + ((y_2 - y_1)*(y_2 - y_1)));
        this.side_2 = Math.sqrt(((x_3 - x_2)*(x_3 - x_2)) + ((y_3 - y_2)*(y_3 - y_2)));
        this.side_3 = Math.sqrt(((x_1 - x_3)*(x_1 - x_3)) + ((y_1 - y_3)*(y_1 - y_3)));
    }

    @Override
    public double calc_perim() {
        perimeter = side_1 + side_2 + side_3;
        return perimeter;
    }

    @Override
    public double calc_area() {
        double semi_perim = (side_1 + side_2 + side_3)/2;
        area = Math.sqrt(semi_perim*(semi_perim-side_1)*(semi_perim-side_2)*(semi_perim-side_3));
        return area;
    }

    public String getType() {
        if (side_1 == side_2 && side_2 == side_3) {
            return "equilateral";
        } else if (side_1 == side_2 ||2 == side_3 || side_3 == side_1) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}

class Quadrilateral extends Shape {
    private int x_1;
    private int x_2;
    private int x_3;
    private int x_4;
    private int y_1;
    private int y_2;
    private int y_3;
    private int y_4;
    private double side_1;
    private double side_2;
    private double side_3;
    private double side_4;
    private double perimeter;
    private double area_s1;
    private double area_s2;
    public Quadrilateral(int x_1, int x_2, int x_3, int x_4, int y_1, int y_2, int y_3, int y_4) {
        this.x_1 = x_1;
        this.x_2 = x_2;
        this.x_3 = x_3;
        this.x_4 = x_4;
        this.y_1 = y_1;
        this.y_2 = y_2;
        this.y_3 = y_3;
        this.y_4 = y_4;

        this.side_1 = Math.sqrt(((x_2 - x_1)*(x_2 - x_1)) + ((y_2 - y_1)*(y_2 - y_1)));
        this.side_2 = Math.sqrt(((x_3 - x_2)*(x_3 - x_2)) + ((y_3 - y_2)*(y_3 - y_2)));
        this.side_3 = Math.sqrt(((x_4 - x_3)*(x_4 - x_3)) + ((y_4 - y_3)*(y_4 - y_3)));
        this.side_4 = Math.sqrt(((x_1 - x_4)*(x_1 - x_4)) + ((y_1 - y_4)*(y_1 - y_4)));
    }

    @Override
    public double calc_perim() {
        perimeter = side_1 + side_2 + side_3 + side_4;
        return perimeter;
    }

    @Override
    public double calc_area() {
        double semi_perim_1 = (side_1 + side_2 + side_3)/2;
        area_s1 = Math.sqrt(semi_perim_1*(semi_perim_1-side_1)*(semi_perim_1-side_2)*(semi_perim_1-side_3));

        double semi_perim_2 = (side_1 + side_4 + side_3)/2;
        area_s2 = Math.sqrt(semi_perim_2*(semi_perim_2-side_1)*(semi_perim_2-side_4)*(semi_perim_2-side_3));

        return (area_s1 + area_s2);
    }

    public String getType() {
        if (side_1 ==side_2 && side_2 == side_3) {
            return "parallelogram";
        } else if (side_1 == side_2 && side_2 == side_3 && side_3 == side_4) {
            return "rhombus";
        } else {
            return "unknown type";
        }
    }
}

public class S1_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X for Circle 1: ");
        int x_cir = scanner.nextInt();
        System.out.println("Y for Circle 1: ");
        int y_cir = scanner.nextInt();
        System.out.println("Radius for Circle 1: ");
        int radius_cir = scanner.nextInt();

        System.out.println("X for Circle 2: ");
        int x_cir1 = scanner.nextInt();
        System.out.println("Y for Circle 2: ");
        int y_cir1 = scanner.nextInt();
        System.out.println("Radius for Circle 2: ");
        int radius_cir1 = scanner.nextInt();

        Circle c1 = new Circle(x_cir, y_cir, radius_cir);
        Circle c2 = new Circle(x_cir1, y_cir1, radius_cir1);
        System.out.println("Area of Circle 1: " + c1.calc_area());
        System.out.println("Perimeter of Circle 1: " + c1.calc_perim());
        System.out.println("Area of Circle 2: " + c2.calc_area());
        System.out.println("Perimeter of Circle 2: " + c2.calc_perim());
        System.out.println("Do Circles Intersect?: " + c1.checkIntersection(c2));
        System.out.println("\n");


        System.out.println("X1 for Triangle: ");
        int x_1_tri = scanner.nextInt();
        System.out.println("Y1 for Triangle: ");
        int y_1_tri = scanner.nextInt();
        System.out.println("X2 for Triangle: ");
        int x_2_tri = scanner.nextInt();
        System.out.println("Y2 for Triangle: ");
        int y_2_tri = scanner.nextInt();
        System.out.println("X3 for Triangle: ");
        int x_3_tri = scanner.nextInt();
        System.out.println("Y3 for Triangle: ");
        int y_3_tri = scanner.nextInt();

        Triangle t = new Triangle(x_1_tri, x_2_tri, x_3_tri, y_1_tri, y_2_tri, y_3_tri);
        System.out.println("Area of Triangle: " + t.calc_area());
        System.out.println("Perimeter of Triangle: " + t.calc_perim());
        System.out.println("Type of Triangle: " + t.getType());
        System.out.println("\n");


        System.out.println("X1 for Quadrilateral: ");
        int x_1_quad = scanner.nextInt();
        System.out.println("Y1 for Quadrilateral: ");
        int y_1_quad = scanner.nextInt();
        System.out.println("X2 for Quadrilateral: ");
        int x_2_quad = scanner.nextInt();
        System.out.println("Y2 for Quadrilateral: ");
        int y_2_quad = scanner.nextInt();
        System.out.println("X3 for Quadrilateral: ");
        int x_3_quad = scanner.nextInt();
        System.out.println("Y3 for Quadrilateral: ");
        int y_3_quad = scanner.nextInt();
        System.out.println("X4 for Quadrilateral: ");
        int x_4_quad = scanner.nextInt();
        System.out.println("Y4 for Quadrilateral: ");
        int y_4_quad = scanner.nextInt();

        Quadrilateral q = new Quadrilateral(x_1_quad, x_2_quad, x_3_quad, x_4_quad, y_1_quad, y_2_quad, y_3_quad, y_4_quad);
        System.out.println("Area of Quadrilateral: " + q.calc_area());
        System.out.println("Perimeter of Quadrilateral: " + q.calc_perim());
        System.out.println("Type of Quadrilateral: " + q.getType());
    }
}