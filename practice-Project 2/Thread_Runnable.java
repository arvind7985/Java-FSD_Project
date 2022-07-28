package project_2;

public class Thread_Runnable implements Runnable {
	
public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000milliseconds=1second
			
		}
		
		
		 
	}
	
	
	public static void main(String[] args) {
		//create target of runnable interface
		
		Thread_Runnable ins1= new Thread_Runnable();
		Thread_Runnable ins2= new Thread_Runnable();
		Thread_Runnable ins3= new Thread_Runnable();
		
		//create threads  by passing runnable targets in constructor
		Thread t1=new  Thread(ins1);
		Thread t2=new  Thread(ins2);
		Thread t3=new  Thread(ins3);
		
		
		t1.setName("First");
		t2.setName("Second");
		
		
	
		t1.start();
		t2.start();
	}

}
