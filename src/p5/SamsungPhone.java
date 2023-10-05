package p5;

public class SamsungPhone extends Phone{

    public SamsungPhone(String model, int number, double weight) {
        super(model,number,weight);
    }

    @Override
    public void info() {
    }

    @Override
    public void info(String model) {
        super.info(model);
    }
}

