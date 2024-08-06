package Byte.InputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingObjects {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("example.obj"));
//            MyObject obj = (MyObject) objectInputStream.readObject();
            objectInputStream.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
