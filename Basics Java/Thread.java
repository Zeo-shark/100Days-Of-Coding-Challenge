class Thread implements Runnable {
   
    private Thread t;
    private String threadname;

    SampleDemo(String threadName)
    {
        this.threadname= threadname;
    }

    public void run(){

        while (true)
        System.out.print(threadname);
    
    }

    public void start()
    {
        if (t== null)
        {
            t=new Thread(this, threadname);
            t.start();
        }
    }
}

public class 
