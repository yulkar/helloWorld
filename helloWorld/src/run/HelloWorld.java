package run;

import worker.Worker;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!\n");
		
		Worker[] workers = new Worker[5];
		workers[0] = new Worker(20,3000, "Sharon");
		workers[1] = new Worker(30, 1500, "Limor");
		workers[2] = new Worker(18, 2000, "Meytal");
		workers[3] = new Worker(40, 4000, "Efrat");
		workers[4] = new Worker(25, 5000, "Mor");
		
		for (Worker w:workers)
		{
			System.out.println("Hello "+w.getName()+", have a nice day!");
		}
		
		System.out.println("\nTest 1");
	}

}
