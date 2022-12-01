//  Напишите метод, который сжимает строку.
// Пример: aaaabbbcdd → a4b3cd2

package Sem_2;

public class Task_02 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressString(str));
    }

    private static String compressString(String str) {
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                builder.append(Character.toString(str.charAt(i - 1)) + count);
                count = 1;
            }
        }
        builder.append(Character.toString(str.charAt(str.length() - 1)) + count);
        return builder.toString();
    }
}