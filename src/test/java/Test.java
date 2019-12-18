import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/11 18:07
 */

public class Test {

    @org.junit.Test
    public void test01() throws InterruptedException {
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

    @org.junit.Test
    public void test02() {
        List<String> stringList = Arrays.asList("9", "2", "7", "5", "3", "5");
        Stream<String> stream = stringList.stream();
        List<String> collect = stream.distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
