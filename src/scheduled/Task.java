package scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Task {

    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public void performTask(int delayStop) {
        Runnable beeper = () -> System.out.println("Run->" + Thread.currentThread().getName());

        ScheduledFuture<?> beeperHandle =
                scheduler.scheduleAtFixedRate(beeper, 4, 4, TimeUnit.SECONDS);

        Runnable canceller = () -> {
            beeperHandle.cancel(false);
            System.out.println("Stop");
            if (beeperHandle.isCancelled()) scheduler.shutdown();
        };

        scheduler.schedule(canceller, delayStop, TimeUnit.SECONDS);



    }
}