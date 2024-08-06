package Character.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class EfficientWriting {
    public static void main(String[] args) {
        // Efiicient Wrinting is achieved by BufferedWriter, jo ki Writer ka object lega toh usme FileWriter bhi de skte hai
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\shrey\\IdeaProjects\\untitled108\\src\\test.txt"));
            bufferedWriter.write("Hello this is written from BufferedWriter");
        }
        catch (Exception e){
            System.out.println(e);
        }


        // We can also print something using BufferedWriter(Character Stream)
        // But console mai print krne ki standard stream is System.out(Byte stream)
        // So OutputStreamWriter will convert it

        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));
    }
}
