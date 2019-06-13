//Name: Pankaj (copied from JournalDev)
//Assignment: Threads Topic
//Comments: Modified by Odell Edwards to add AtomicLong variable
//	which is thread safe.
//Date: May 27, 2019
//CIT-360
//
import java.util.concurrent.atomic.AtomicLong;

public class WorkerThread implements Runnable {
  
    private String command;
    
    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        long seqNumber = processCommand();
        System.out.println(Thread.currentThread().getName()+" End. Sequence = "+ seqNumber);
    }

    private long processCommand() {
    	long seqNumber = 0;
        try {
            Thread.sleep(5000);
            seqNumber = Sequencer.next();
                      
             } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return seqNumber;
   }

    @Override
    public String toString(){
        return this.command;
    }
}

/**
 * @author Copied from post by Luis Cordeiro
 *
 */
class Sequencer {
	   private final static AtomicLong sequenceNumber  = new AtomicLong(0);
	   public static long next() {
	     return sequenceNumber.getAndIncrement();
	   }
	 }

