package task;
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.setNumber(555444733);
        phone1.setModel("Samsung");
        phone1.setWeight(50);
        phone1.setName("Adam");
        Phone phone2 = new Phone();
        phone2.setNumber(775444253);
        phone2.setModel("Motorola");
        phone2.setWeight(50);
        phone2.setName("Max");
        Phone phone3 = new Phone();
        phone3.setNumber(45647784);
        phone3.setModel("Iphone");
        phone3.setWeight(50);
        phone3.setName("Alex");
        Phone phone = new Phone();

        System.out.println("\n" + "Phone №1: " + "\n" + "Number: " + phone1.getNumber() + "; Model: " + phone1.getModel() + "; Weight: " + phone1.getWeight());
        System.out.println("Pnone №2: " + "\n" + "Number: " + phone2.getNumber() + "; Model: " + phone2.getModel() + "; Weight: " + phone2.getWeight());
        System.out.println("Phone №3: " + "\n" + "Number: " + phone3.getNumber() + "; Model: " + phone3.getModel() + "; Weight: " + phone3.getWeight());
        System.out.println();
        phone1.receiveCall();
        System.out.println();
        phone2.receiveCall();
        System.out.println();
        phone3.receiveCall();

        phone1 = new Phone(phone1.getNumber(), phone1.getModel(), phone1.getWeight(), phone1.getName());
        System.out.println();
        phone.receiveCall(phone1.getName(), phone1.getNumber());
        System.out.println();
        phone.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
    }

}