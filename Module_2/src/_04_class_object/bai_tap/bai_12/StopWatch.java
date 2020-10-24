package _05_class_object.bai_tap.bai_12;

import java.time.Instant;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public long Start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long Stop(){
        this.stopTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long getElapsedTime() {
        return (this.stopTime - this.startTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        int count = 0;
        for (int x = 0; x < 100000000; x++) {
            for (int y = 0; y < 10000000; y++) {
                count += 1;
            }
        }
        stopWatch.Stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
