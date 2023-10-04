package p5;

public class Main {


    public static void main(String[] args) {

        Phone SamsungPhone = new SamsungPhone("Samsung A100", 98765433, 189.7);
        SamsungPhone.info();

        Phone ApplePhone = new ApplePhone("Apple 15", 62786454, 230.7);
        ApplePhone.info();

        Phone XiaomiPhone = new XiaomiPhone("Poco", 98765543, 200.7);
        XiaomiPhone.info();





        Phone apple = new Phone() {
            @Override
            public void info() {

            }
        };
        Phone apple1  = new Phone("ApMax", 355433222, 231) {
            @Override
            public void info() {

            }

        };
        Phone apple2  = new Phone("ApPro", 355678898, 189) {
            @Override
            public void info() {

            }

        };

        apple2.info();
        apple1.info();
        apple.info();
        apple.getNumber();
        apple.info();
        apple.receiveCall("Max");
        apple1.receiveCall("Dasha");
        apple2.receiveCall("lex");














    }













    }

