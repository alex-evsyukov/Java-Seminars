// Напишите метод, который составит строку, состоящую из 100 
// повторений слова TEST и метод, который запишет эту строку в 
// простой текстовый файл, обработайте исключения.

package Sem_2.Task_04;

import java.io.FileWriter;
import java.io.IOException;

public class Task_04 {
  public static void main(String[] args) {
    System.out.println(multiplyString("TEST"));
    writeFile(multiplyString("TEST"));
  }

  private static String multiplyString(String str) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      builder.append(str);
    }
    return builder.toString();
  }

  private static void writeFile(String str) {
    try (FileWriter writer = new FileWriter("file_04.txt", false)) {
      // запись всей строки
      writer.write(str);
      writer.flush();
    } catch (IOException ex) {

      System.out.println(ex.getMessage());
    }
  }
}