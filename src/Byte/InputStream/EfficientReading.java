package Byte.InputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class EfficientReading {
    public static void main(String[] args) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\shrey\\IdeaProjects\\untitled108\\untitled108.iml"));
            int byteData;
            while ((byteData = bufferedInputStream.read()) != -1) {
                System.out.print(byteData);
            }
            bufferedInputStream.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
