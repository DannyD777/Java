package p5;

public interface Callable {
    static void receiveCall(String name) {
        System.out.printf("Звонит : " + name);

    }
}
