public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            HelloWorld ciao = new HelloWorld(i);
            Thread thread = new Thread(ciao);
            thread.start();
        }
    }
}