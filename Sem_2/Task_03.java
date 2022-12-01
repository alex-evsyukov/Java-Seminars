// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
// Палиндром - слово или фраза, которые одинаково читаются слева направо и справа налево.
// "П. «Я иду с мечем судия»"

package Sem_2;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("12321"));
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}