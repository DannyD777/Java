package p5;

public class XiaomiPhone extends Phone{
    public XiaomiPhone(String model, int number, int weight) {
        super(model, number, weight);
    }

    @Override
    public void info() {
        System.out.printf(" Model:  %s \n Number: %d \n Weight: %d \n", model, number, weight);
    }
}
