import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderRealese {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        String s = "";
        while (true) {
            s = reader.readLine();
            if (s != null) break;

        }
        System.out.println(s);
        String[] array = s.split(" ");
        for(String temp : array){
            System.out.println(temp);
        }

    }
}
