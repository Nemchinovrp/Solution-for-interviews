import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis = null;
        try {
             fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buf = new byte[(int)file.length()];
        fis.read(buf);
        String s = new String(buf, "UTF-8");
        String[] slovo = s.split(" ");
        for(String temp : slovo){
            System.out.println(temp);
        }

    }
}
