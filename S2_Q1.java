import java.util.Scanner;

class Vector {
    double x_coord;
    double y_coord;
    double z_coord;

    public Vector(float x_coord, float y_coord, float z_coord) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.z_coord = z_coord;
    }

    public static String add_vector(Vector vector1, Vector vector2) {
        double x = vector1.x_coord + vector2.x_coord;
        double y = vector1.y_coord + vector2.y_coord;
        double z = vector1.z_coord + vector2.z_coord;
        return x + "i + " + y + "j + " + z + "k";
    }

    public static double dot_product(Vector vector1, Vector vector2) {
        double x = vector1.x_coord * vector2.x_coord;
        double y = vector1.y_coord * vector2.y_coord;
        double z = vector1.z_coord * vector2.z_coord;
        return x + y + z;
    }

    public static String cross_product(Vector vector1, Vector vector2) {
        double x = (vector1.y_coord * vector2.z_coord) - (vector2.y_coord * vector1.z_coord);
        double y = ((vector1.x_coord * vector2.z_coord) - (vector2.x_coord * vector1.z_coord)) * (-1);
        double z = (vector1.x_coord * vector2.y_coord) - (vector2.x_coord * vector1.y_coord);
        return x + "i + " + y + "j + " + z + "k";
    }
}

public class S2_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x-coordinate of 1st vector: ");
        float x1 = scanner.nextFloat();
        System.out.println("Enter y-coordinate of 1st vector: ");
        float y1 = scanner.nextFloat();
        System.out.println("Enter z-coordinate of 1st vector: ");
        float z1 = scanner.nextFloat();
        System.out.println("Enter x-coordinate of 2nd vector: ");
        float x2 = scanner.nextFloat();
        System.out.println("Enter y-coordinate of 2nd vector: ");
        float y2 = scanner.nextFloat();
        System.out.println("Enter z-coordinate of 2nd vector: ");
        float z2 = scanner.nextFloat();
        System.out.println("\n");

        Vector v1 = new Vector(x1, y1, z1);
        Vector v2 = new Vector(x2, y2, z2);

        System.out.println("Sum: " + Vector.add_vector(v1, v2));
        System.out.println("Dot Product: " + Vector.dot_product(v1, v2));
        System.out.println("Cross Product: " + Vector.cross_product(v1, v2));
    }
}