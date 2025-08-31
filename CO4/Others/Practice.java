import java.io.FileReader;

public class Practice {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("file.txt");

            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
        
    }
}
