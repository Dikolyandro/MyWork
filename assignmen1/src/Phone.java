public class Phone {
    public String number;
    public double weight;
    public String model;
    public Phone(String number, double weight, String model){
        this.number=number;
        this.weight= weight;
        this.model=model;
    }

    public static void main(String[] args) {
        Phone ph1 = new Phone("87009903057",246.8,"iphone 11");
        Phone ph2 = new Phone("87771110101",229,"iphone 12 mini");
        Phone ph3 = new Phone("8708321567",334.9,"iphone 15 pro max");

        System.out.println(ph1.number + ", " +  ph1.model + ", " + ph1.weight);

        System.out.println(ph2.number + ", " +  ph2.model + ", " + ph2.weight);

        System.out.println(ph3.number + ", " +  ph3.model + ", " + ph3.weight);

        ph1.recieveCall("Casy");
        ph1.getNumber(ph1.number);
        ph1.overloaded("Casy", ph1.number);

        ph2.recieveCall("Alex");
        ph2.getNumber(ph2.number);
        ph2.overloaded("Alex", ph2.number);

        ph3.recieveCall("Jeremy");
        ph3.getNumber(ph3.number);
        ph3.overloaded("Jeremy", ph3.number);


        ph1.sendMessage(ph1.number);
        ph2.sendMessage(ph2.number);
        ph3.sendMessage(ph3.number);
    }
    public void overloaded (String name, String number) {
        System.out.println(name + " is calling from " + number);
    }
    public void recieveCall (String name) {
        System.out.println(name+" is ringing");
    }
    public void getNumber (String number) {
        System.out.println(number);
    }
    public void sendMessage (String number) {
        System.out.println("Sending message to " + number);
    }
}