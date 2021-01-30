package someTrain.ThreadPoolDemo;

import java.util.Date;

public class MyRunnable implements Runnable {

    private String command;

    public MyRunnable(String command){
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+this.command+ " Start Time = "+ new Date());
        processComand();
        System.out.println(Thread.currentThread().getName()+ " End Time = "+ new Date());
    }

    private void processComand() {
        System.out.println("开始休眠");
        try {
            Thread.sleep(5000);
            System.out.println("休眠结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
