package com.mphasis.multi;

public class ThreadSender extends Thread {

	
	private String msg;
	private Sender sender;
	public ThreadSender(String msg, Sender sender) {
		super();
		this.msg = msg;
		this.sender = sender;
	}

	public void run() {
		
		synchronised (sender) {
			
			sender.send(msg);
		}
	}
	
	
}
