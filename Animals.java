public class Animals {

    public void eat() {
        System.out.println("Eating..");
    }
    public class dog extends Animals {
        public void barking() {
            System.out.println("The dog is barking");
        }
    }
    public class cow extends Animals {
        public void walking() {
            System.out.println("The cow is walking in the field");
        }
    }
    public static void main(String[] args) {
        dog Bobby = new Animals().new dog();
        Bobby.eat();
        Bobby.barking();

        cow Karolin = new Animals().new cow();
        Karolin.eat();
        Karolin.walking();
    }

}
