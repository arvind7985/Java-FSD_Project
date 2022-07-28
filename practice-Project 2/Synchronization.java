package project_2;
 class User extends Thread {
	String name;
	String msg;
	Sender sender;
	
	public User(String name,String msg, Sender sender) {
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		System.out.println(name + "wants to send message : "+msg);
		
		//without synchronization
	    //sender.send(msg);
	    
	    //with synchronization
	    synchronized(sender) {
	    	sender.send(msg);
	    }
	}
}

class Sender  {
	
	void send(String msg) {
		System.out.println("Sending msg...:"+msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while sending: "+e);
		}
		
		System.out.println("Message Sent Successfully");
	}

}

public class Synchronization {

public static void main(String[] args) {
		
		Sender sender = new  Sender();
		

		User t1= new User("Rahul", "Hi!", sender);
		User t2= new User("amit","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}
	
	
}
