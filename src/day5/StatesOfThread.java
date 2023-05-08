package day5;
class Demo implements  Runnable{
	public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
public class StatesOfThread {

	public static void main(String[] args) throws InterruptedException {
		Demo obj = new Demo();
		Thread t = new Thread(obj);//new
		System.out.println("Thread State: "+ t.getState());
		t.start();  //runnable
		System.out.println("Thread State: "+ t.getState());
		Thread.sleep(1000); //waiting
		System.out.println("Thread State: "+ t.getState());
		Thread.sleep(3000); //terminated
		System.out.println("Thread State: "+ t.getState());
		
	}

}
