import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Notifier extends TimerTask {
        Timer timer;
        public static int i = 0;
        public void run()
        {
            System.out.println("Notification reminder message .... " + ++i);
            if(i == 3){
                timer.cancel();
                System.out.println("You are out of time");
            }
        }

    public static void main(String [] args) {
        Timer timer = new Timer();
        TimerTask task = new Notifier();
        timer.schedule(task, 2000, 5000);
        System.out.println(task.scheduledExecutionTime());

    }

}
