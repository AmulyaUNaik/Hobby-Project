import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ClockRotation {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Calendar calendar = Calendar.getInstance();
        timer.scheduleAtFixedRate(new TimerTask() {
            
            public void run() {
               
                int htime = calendar.get(Calendar.HOUR_OF_DAY);
                int mtime = calendar.get(Calendar.MINUTE);
                int stime = calendar.get(Calendar.SECOND);
                int hrotation = 30 * htime + mtime / 2;
                int mrotation = 6 * mtime;
                int srotation = 6 * stime;

                System.out.println("Hour rotation: " + hrotation + " degrees");
                System.out.println("Minute rotation: " + mrotation + " degrees");
                System.out.println("Second rotation: " + srotation + " degrees");
            }
        }, 0, 1000);
    }
}
