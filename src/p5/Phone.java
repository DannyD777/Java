package p5;


public abstract class Phone implements Callable,Informable {


    private String model;
    private int number;
    private double weight;



    {
        System.out.println("\n Start init object");

    }

    public Phone() {

        this("none", 0, 0);
        System.out.println("-----------------------------------");

    }


    public Phone(String model, int number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
        System.out.printf(" Model:  %s \n Number: %d \n Weight: %f \n", model, number, weight);
        System.out.println("-----------------------------------");
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
        System.out.printf(" Model:  %s \n Number: %d \n", model, number);
        System.out.println("-----------------------------------");
    }




    public int getNumber() {
        return number;

    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void info();

    public abstract  void receiveCall(String name);






}



