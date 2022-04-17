public class PrimeTest {
    public static void main(String[] args) {
        Prime p = new Prime();
        NonPrime np = new NonPrime();
        Thread t = new Thread(p);
        Thread t2 = new Thread(np);
        t.start();
        t2.start();
    }}

