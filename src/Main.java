import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Введите имя для сохранение в список А :");
            name.add(scanner.nextLine());
            System.out.println("Имена: " + name);
        }
        System.out.println("---------------------------");
        System.out.println(" ");

        ArrayList<String> name2 = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Введите имя для сохранение в список B :");
            name2.add(scanner2.nextLine());
            System.out.println("Имена: " + name2);
        }

        ArrayList<String> name3 = new ArrayList<>();
        Integer general = 5;
        for (int i = 0; i <= 4; i++) {
            name3.add(name.get(i));
            general = general - 1;
            name3.add(name2.get(i));
        }
        System.out.println(name3);
        Collections.sort(name3, Comparator.comparing(String::length));
        System.out.println(name3);
    }
}