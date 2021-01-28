package someTrain.CountDownLatchAndCyclicBarrier;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        ExecutorService service = Executors.newFixedThreadPool(6);
        DiskMemory diskMemory = new DiskMemory();
        for(int i=0;i<4;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    int timer = new Random().nextInt(5);
                    try {
                        Thread.sleep(timer*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int diskSize = diskMemory.getSize();
                    System.out.printf("完成磁盘的统计任务，耗费%d秒，磁盘大小为%d.\n", timer, diskSize);
                    diskMemory.setSize(diskSize);

                    //任务完成后，计数器减1
                    countDownLatch.countDown();
                    System.out.println("count num="+countDownLatch.getCount());
                }
            });
        }
        //主线程一直被阻塞，直到count的计数器被置为0
        countDownLatch.await();
        System.out.printf("全部磁盘统计完成，所有磁盘总大小.\n"+",totalSize ="+diskMemory.getTotalSize());
        service.shutdown();
    }

    private static class DiskMemory{
        private int totalSize;
        public int getSize(){
            return (new Random().nextInt(3)+1)*100;//加一是为了防止获取磁盘大小为0，不符合常理
        }
        public synchronized  void setSize(int size){
            totalSize += size;
        }
        public int getTotalSize(){
            return totalSize;
        }
    }
}

