package p5;

public class SamsungPhone extends Phone{
    public SamsungPhone(String model, int number, int weight) {
        super(model,number,weight);
    }



    @Override
    public void info() {
        System.out.printf(" Model:  %s \n Number: %d \n Weight: %d \n", model, number, weight);
    }
}
