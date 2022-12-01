// Дано число N (> 0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов.

package Sem_2;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println(alternativeCahracters(11, 'C', '-'));
    }

    private static String alternativeCahracters(int length, char c1, char c2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++)
            if (i % 2 == 0)
                builder.append(c1);
            else
                builder.append(c2);
        return builder.toString();
    }
}
