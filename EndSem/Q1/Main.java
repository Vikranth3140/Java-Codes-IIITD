package Q1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // serialization
        VacuumCleaner vc1 = new VacuumCleaner("First VC");
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("cleaner.txt"));
            out.writeObject(vc1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert out != null;
            out.close();
        }

        // deserialization
        Cleaner c2 = null;
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("cleaner.txt"));
            c2 = (VacuumCleaner) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert in != null;
            in.close();
        }
        c2.clean();
    }
}