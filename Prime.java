
//Implement a class that checks whether a given number is a prime using
//both the Thread class and Runnable interface

public class Prime implements Runnable{

    @Override
    public void run() {
        for(int i =1; i < 10; i++) {
            if(i == 2 || i == 3 || i == 5 || i == 7) System.out.println(" prime numbers " +i);

        try{
                Thread.sleep(3000); }
                catch (InterruptedException e)

    {
        e.printStackTrace();
    }
    }}
}
 class NonPrime extends Thread {
    @Override
     public void run() {
        for(int i = 1; i < 10; i++) {
            if(i == 4 || i == 6 || i == 8 || i == 9 || i ==10)
            System.out.println("non prime numbers" +i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 }

