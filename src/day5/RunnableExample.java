package day5;


public class RunnableExample {
	
	public static void main(String []args) {
		
		Runnable obj1=() ->
		{
		
          for(int i=1;i<=10;i++) {
			
			System.out.println("Hello WOrld!");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
		
		};
        Runnable obj2= () ->
  		{
  		
            for(int i=1;i<=10;i++) {
  			
  			System.out.println("Hello ");
  			try {
  				Thread.sleep(10);
  			} catch (InterruptedException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
            }
  		};
            
            
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            
            t1.start();
            t2.start();
            
	}

		}
