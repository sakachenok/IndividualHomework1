public class Phone {
    public String number;
    public String model;
    public double weight;
    public String callerName;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void receiveCall(String callerName){
                System.out.println("Звонит " + callerName);
    }

    public static String getNumber (String number){

        return number;
    }

    public static void receiveCall2(String callerName, String number){
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
