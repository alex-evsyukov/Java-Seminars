// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
// оно должно записаться в лог-файл.

package Sem_2.Task_05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_05 {
    public static void main(String[] args) {
        String[] fileList = dirList("./");
        Logger logger = Logger.getLogger(Task_05.class.getName());
        try {
            writeFile(fileList);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Error!", ex);
        } catch (NullPointerException ex) {
            logger.log(Level.SEVERE, "Error!", ex);
        }

    }

    private static String[] dirList(String dir) {
        File f1 = new File(dir);
        String[] filelist = f1.list();
        return filelist;
    }

    private static void writeFile(String[] str) throws IOException {
        try (FileWriter writer = new FileWriter("file_05.txt", false)) {
            // запись всей строки
            for (int i = 0; i < str.length; i++) {
                writer.write(str[i]);
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}