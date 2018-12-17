import java.io.*;

public class Reader {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\student\\Documents\\Test.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
