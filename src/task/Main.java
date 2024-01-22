package task;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone = new Phone();

        System.out.print("Введите номер 1-го телефона: ");
        phone1.number = getNum();
        System.out.print("Введите его модель: ");
        phone1.model = getStr();
        System.out.print("Введите вес телефона: ");
        phone1.weight = getNum();
        System.out.print("Введите имя владельца: ");
        phone1.name = getStr();
        System.out.print("Введите номер 2-го телефона: ");
        phone2.number = getNum();
        System.out.print("Введите его модель: ");
        phone2.model = getStr();
        System.out.print("Введите вес телефона: ");
        phone2.weight = getNum();
        System.out.print("Введите имя владельца: ");
        phone2.name = getStr();
        System.out.print("Введите номер 3-го телефона: ");
        phone3.number = getNum();
        System.out.print("Введите его модель: ");
        phone3.model = getStr();
        System.out.print("Введите вес телефона: ");
        phone3.weight = getNum();
        System.out.print("Введите имя владельца: ");
        phone3.name = getStr();


        System.out.println("\n" + "Phone №1: " + "\n" + "Number: " + phone1.number + "; Model: " + phone1.model + "; Weight: " + phone1.weight);
        System.out.println("Pnone №2: " + "\n" + "Number: " + phone2.number + "; Model: " + phone2.model + "; Weight: " + phone2.weight);
        System.out.println("Phone №3: " + "\n" + "Number: " + phone3.number + "; Model: " + phone3.model + "; Weight: " + phone3.weight);
        System.out.println();
        phone1.receiveCall();
        phone1.getNumber();
        System.out.println();
        phone2.receiveCall();
        phone2.getNumber();
        System.out.println();
        phone3.receiveCall();
        phone3.getNumber();

        phone1 = new Phone(phone1.number, phone1.model, phone1.weight, phone1.name);
        System.out.println();
        phone.receiveCall(phone1.name, phone1.number);
        System.out.println();
        phone.sendMessage(phone1.number, phone2.number, phone3.number);
    }

    static int getNum() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    static String getStr() {
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }
}
