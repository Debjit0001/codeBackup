public class Priorities extends Thread
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}

	public static void main(String[] args) {
		Priorities thread1 = new Priorities();
		Priorities thread2 = new Priorities();

		thread1.start();
		thread2.start();

		int a = thread1.getPriority();
		int b = thread2.getPriority();

		System.out.println(a + "\n" + b);
	}
}
