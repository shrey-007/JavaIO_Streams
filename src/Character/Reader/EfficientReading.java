package Character.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class EfficientReading {
    // For efficient reading , we will use BufferedReader
    public static void main(String[] args) {

        try{
            // Constructor takes Reader object(Reader is any input character stream) it could be file also
            BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\shrey\\IdeaProjects\\untitled108\\untitled108.iml"));

            // FileReader character by character read kr rha tha, but apan ek line ke saare characters ko buffer mai store krke poori line print kr skte hai
            // if line exist toh voh String mai daal dega else vo null dega
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.print(line);
            }

            bufferedReader.close();
            System.out.println();
            System.out.println();

        }
        catch (Exception e){
            System.out.println(e);
        }

        // We acn also read input from user using BufferedReader
        // BufferedReader is character stream, System.in is standard keyboard input stream which is Byte stream
        // So InputStreamReader will convert the byte stream to character stream
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Name");
            String name=bufferedReader.readLine();

            System.out.println("Enter age");
            String ageInString=bufferedReader.readLine();
            int age=Integer.parseInt(ageInString);

            System.out.println("Your name is "+name+" and your age is "+age);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
