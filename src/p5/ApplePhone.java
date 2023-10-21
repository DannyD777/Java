package p5;

public class ApplePhone extends Phone{


    public ApplePhone(String model, int number, double weight) {
        super(model, number, weight);
    }

    @Override
    public void info() {
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("Calling is %s", name);
    }
}

