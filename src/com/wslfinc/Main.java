package com.wslfinc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Wsl_F
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        a.a = 25092016;
        a.b = new B();
        a.b.b = "current date";

        A a2 = null;
        try {
            serialize(a);
            a2 = desirialize();
            a2.print();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }

        a.print();
    }

    public static void serialize(A a) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.flush();
        oos.close();
    }

    public static A desirialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        return (A) oin.readObject();
    }
}
