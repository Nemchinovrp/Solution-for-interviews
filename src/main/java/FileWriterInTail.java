import java.io.*;

public class FileWriterInTail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку для записи в файл ");
        String s = reader.readLine();
        File file = new File("out.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write(s.getBytes());
        System.out.println("Запись в файл завершена");

    }
}
