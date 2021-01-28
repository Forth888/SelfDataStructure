package someTrain.producerconsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer {

    public static void main(String[] args) {
        Storage storage = new Storage();
        ExecutorService service = Executors.newCachedThreadPool();

        Producer producer1 = new Producer("张三",storage);
        Producer producer2 = new Producer("李四",storage);
        Consumer consumer1 = new Consumer("王五",storage);
        Consumer consumer2 = new Consumer("赵六",storage);

        service.submit(producer1);
        service.submit(producer2);
        service.submit(consumer1);
        service.submit(consumer2);


    }
}
