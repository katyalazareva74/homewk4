package exeption;

import java.util.Scanner;
public class Main {
    /**
     * Метод main позводяет ввести логин и пароль и проверить их правильность. Если пароль был введен некорректно,
     * то здесь обрабатывается исключение, выброшенное в методе check класса Verification.
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            boolean count = true;
            while (count) {
                System.out.println("Введите логин: ");
                String log = scan.nextLine();
                System.out.println("Введите пароль: ");
                String passwd = scan.nextLine();
                System.out.println("Подтвердите пароль: ");
                String confirmpasswd = scan.nextLine();
                try {
                    if (Verification.check(log, passwd, confirmpasswd)) {
                        System.out.println("Authorization was successful!");
                        count = false;
                    }
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Try again");
                }
            }
        }
    }
}