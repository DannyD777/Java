package p5;

public class Main {


    public static void main(String[] args) {
        Phone apple = new Phone() {
            @Override
            public void info() {

            }
        };
        apple.printInfo();
        apple.model = "Apple";
        apple.number = 895377777;
        apple.weight = 194;
        apple.printInfo();
        apple.getNumber();
        apple.printInfo();
        apple.receiveCall("Max");


        Phone apple1  = new Phone("ApMax", 355433222, 231) {
            @Override
            public void info() {

            }
        };
        apple1.printInfo();

        Phone apple2  = new Phone("ApPro", 355678898, 189) {
            @Override
            public void info() {

            }
        };
        apple2.printInfo();

        Phone SamsungPhone = new SamsungPhone("Samsung A100", 12345456, 190);
        SamsungPhone.info();

        Phone ApplePhone = new ApplePhone("Apple 15", 62786454, 230);
        ApplePhone.info();

        Phone XiaomiPhone = new XiaomiPhone("Poco", 98765543, 200);
        XiaomiPhone.info();












    }













    }

