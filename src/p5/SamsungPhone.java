package p5;

public  class SamsungPhone extends Phone {


    public SamsungPhone(String model, int number, double weight){
    }

    @Override
    public void info() {
        System.out.println("Samsung phone: " + getModel() + " " + getNumber() + " " + getWeight());
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("Calling is %s", name);
    }

}



