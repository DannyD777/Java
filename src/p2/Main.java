package p2;

public class Main {
    public static void main(String[] args) {

        int [] mas = new int[50];

        for (int i=0; i<mas.length;i++){
            mas[i]=(int)(Math.random()*100-50);

        }

        for (int item: mas){
            System.out.println( item + " ");

        }

        int pos=0;
        int neg=0;
        int zero=0;
        int sumPos=0;
        int sumNeg=0;
        int average=0;

        for (int item: mas){
            if (item > 0){
                pos++;
                sumPos=sumPos+item;
               // sumPos+=item;
            } else if (item < 0){
                neg++;
                sumNeg=sumNeg+item;
               // sumNeg+=item;

            }else{
                zero ++;
            }


            average=(sumNeg+sumPos)/50;

            System.out.println("------------");
            System.out.println("+: " + pos);
            System.out.println("-: " + neg);
            System.out.println("0: " + zero);
            System.out.println("SumPos: " + sumPos);
            System.out.println("SumNeg: " + sumNeg);
            System.out.println("Average: " + average);
            }

        }





}
