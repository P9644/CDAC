package cog.ex;
import java.lang.*;

	class InstanceCounter {
	    private static int instanceCount = 0;

	    public InstanceCounter() {
	        instanceCount++;
	    }

	    public static int getInstanceCount() {
	        return instanceCount;
	    }
	}

	public class Q1 {
	    public static void main(String[] args) {

	    	InstanceCounter obj1 = new InstanceCounter();
	        InstanceCounter obj2 = new InstanceCounter();
	        InstanceCounter obj3 = new InstanceCounter();

	        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
	    }
	}


/*1.	Design and implement a class named InstanceCounter to track and count the number of instances created from this class.*/