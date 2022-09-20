package ua.plotnichenko.hw6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380 (95) 555 66 77", "iphone", 171.5);
        Phone phone2 = new Phone("+380 (99) 999 44 44", "samsung");
        Phone phone3 = new Phone();

        phone3.setNumber("+380 (97) 777 33 22");
        phone3.setModel("xiaomi");
        phone3.setWeight(180.25);

        System.out.println("PHONE 1: " + phone1);
        System.out.println("PHONE 2: " + phone2);
        System.out.println("PHONE 3: " + phone3);


        System.out.println("RECEIVE CALL");
        phone1.receiveCall("James");
        phone2.receiveCall("Sarah");
        phone3.receiveCall("Bob");

        System.out.println("GET NUMBER");
        System.out.println("1: " + phone1.getNumber());
        System.out.println("2: " + phone2.getNumber());
        System.out.println("3: " + phone3.getNumber());
    }
}



