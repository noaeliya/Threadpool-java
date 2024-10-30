import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		//ExecutorService executor = Executors.newSingleThreadExecutor(); --> only one thread. similar to queue
		//ExecutorService executor = Executors.newFixedThreadPool(2); --> up to 2 threads. each task will run on available thread or wait for the thread to be available.
		//ExecutorService executor = Executors.newCachedThreadPool(); --> unlimited amount of threads. 

		ExecutorService executor = Executors.newCachedThreadPool();

		executor.execute(new RunnableTask1());
		executor.execute(new RunnableTask2());
		executor.execute(new RunnableTask3());		
	}
}
