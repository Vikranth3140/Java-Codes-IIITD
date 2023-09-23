import java.util.Scanner;

class Exception_Error extends Exception {
    public Exception_Error(String message) {
        super(message);
    }
//    @Override
//    public String toString() {
//        return super.getMessage();
//    }
}
class Earthquake {
    private String Name;
    private float Intensity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getIntensity() {
        return Intensity;
    }

    public void setIntensity(float intensity) {
        Intensity = intensity;
    }
}

public class S1_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please print the Name: ");
        String name = scanner.nextLine();

        System.out.print("Please print the Intensity: ");
        float intensity = scanner.nextFloat();

//        try {                                ----------------> Also Correct
//            if (intensity < 2.0 || intensity > 8.0) {
//                throw new Exception_Error("Intensity not in the valid range (2.0 to 8.0)");
//            }
//            Earthquake e = new Earthquake();
//            e.setName(name);
//            e.setIntensity(intensity);
//            System.out.println(e.getName());
//            System.out.println(e.getIntensity());
//        }
//        catch (Exception_Error err) {
//            System.out.println("Error: " + err.getMessage());
//        }

        if (intensity < 2.0 || intensity > 8.0) {
            try {
                throw new Exception_Error("Intensity not in the valid range (2.0 to 8.0)");
            } catch (Exception_Error err) {
                System.out.println("Error: " + err.getMessage());
            }

        }
        else {
            Earthquake e = new Earthquake();
            e.setName(name);
            e.setIntensity(intensity);
            System.out.println(e.getName());
            System.out.println(e.getIntensity());
        }
    }
}