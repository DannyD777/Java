package p5;

public class XiaomiPhone extends Phone{
    public XiaomiPhone(String model, int number, double weight) {
        super(model, number, weight);
    }

    @Override
    public void info() {
    }

    @Override
    public void info(String model) {
        super.info(model);
    }
}
