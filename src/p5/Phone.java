package p5;


public class Phone {



    String model;
    int number;
    int weight;




    {
        System.out.println("\n Start init object");

    }

    public Phone() {

    this("none", 0,0);
        System.out.println("-----------------------------------");

    }



    public Phone(String model, int number, int weight) {
         this.model = model;
         this.number = number;
         this.weight = weight;
        System.out.println("-----------------------------------");
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
        System.out.println("-----------------------------------");
    }

    public void receiveCall(String max){
        System.out.println("Звонит: \n " + max);
        System.out.println("-----------------------------------");


    }
    public int getNumber() {
        System.out.println("Number: " + number);
        System.out.println("-----------------------------------");
        return number;

    }
    void printInfo(){
        System.out.printf(" Model:  %s \n Number: %d \n Weight: %d \n", model, number, weight );
        System.out.println("-----------------------------------");
    }
}


