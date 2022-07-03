import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_Ex {  

	public static void main(String[] args) {  

		ExecutorService executorService = Executors.newSingleThreadExecutor();  

		executorService.execute(new Runnable() {  

			public void run() {  

				System.out.println("ExecutorService");  

			}  

		});  

		executorService.shutdown();  
	}  
}   
