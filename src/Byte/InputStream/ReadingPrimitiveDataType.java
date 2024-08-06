package Byte.InputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadingPrimitiveDataType {
    public static void main(String[] args) {
        try{
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\shrey\\IdeaProjects\\untitled108\\untitled108.iml"));
            int intValue = dataInputStream.readInt();
            float floatValue = dataInputStream.readFloat();
            dataInputStream.close();

        }
        catch (Exception e){

        }
    }
}
