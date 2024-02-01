package task;
public class Phone {
    private int number;
    private String model;
    private int weight;
    private String name;

    public Phone() {
    }
    public Phone(int number, String model, int weight, String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void receiveCall() {
        System.out.println("Звонит: " + name);
    }
    public void receiveCall(String name, int num) {
        System.out.println("Повторный звонок: " + "\n" + name + "\n" + num);
    }
    public void sendMessage(int number1, int number2, int number3) {
        System.out.println("Сообщение отправлено: " + "\n" + number1 + "\n" + number2 + "\n" + number3);
    }
}

