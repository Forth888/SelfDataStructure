package someTrain.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {

    BlockingQueue<Product> blockingQueue = new LinkedBlockingQueue<>(10);

    public void push(Product p) throws InterruptedException {
        blockingQueue.put(p);
    }

    public Product pop() throws InterruptedException {
        return blockingQueue.take();
    }

}
