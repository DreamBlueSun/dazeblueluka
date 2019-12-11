import java.util.Timer;
import java.util.TimerTask;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/11 18:07
 */

public class Test {

    @org.junit.Test
    public void test() throws InterruptedException {
        System.out.println("start");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("====");
                timer.cancel();
            }
        },3000);
        Thread.sleep(7000);
        System.out.println("end");
    }

}
