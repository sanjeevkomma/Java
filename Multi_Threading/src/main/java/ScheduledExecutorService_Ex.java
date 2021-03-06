import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService_Ex {

	public static void main(String args[]) throws InterruptedException {

		ExecutorService executor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());

		ScheduledFuture<?> future = ((ScheduledExecutorService) executor).schedule(task, 3, TimeUnit.SECONDS);

		TimeUnit.MILLISECONDS.sleep(1337);

		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);

		System.out.printf("Remaining Delay: %sms", remainingDelay);

	}

}
