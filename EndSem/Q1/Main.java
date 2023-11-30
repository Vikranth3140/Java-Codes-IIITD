package Q1;

import java.io.*;


public class Main {
    VacuumCleaner vc1 = new VacuumCleaner("First VC");

    // serialization
    ObjectOutputStream out = null;

    {
        try {
            out = new ObjectOutputStream(new FileOutputStream("cleaner.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            out.writeObject(vc1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    {
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // deserialization
    ObjectInputStream in = null;
    Cleaner c2 = null;

     {
        try {
            in = new ObjectInputStream(new FileInputStream("cleaner.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            c2 = (VacuumCleaner) in.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
     {
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}