package task;

public class Phone {
    public int number;
    public String model;
    public int weight;
    public String name;

    public void receiveCall() {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, int num) {
        System.out.println("Повторный звонок: " + "\n" + name + "\n" + num);
    }

    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(int number1, int number2, int number3) {
        System.out.println("Сообщение отправлено: " + "\n" + number1 + "\n" + number2 + "\n" + number3);
    }

    public Phone(int a, String b, int c, String d) {
        number = a;
        model = b;
        weight = c;
        name = d;
    }

    public Phone() {
    }
}

