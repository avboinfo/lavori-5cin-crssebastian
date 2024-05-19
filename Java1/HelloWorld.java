public class HelloWorld implements Runnable {
    private int matricola;

    public HelloWorld(int matricola) {
        this.matricola = matricola;
    }
    public void run() {
        System.out.println("Il thread n° " + matricola + " ti dice: Ciao!");
    }
}