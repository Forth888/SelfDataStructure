package someTrain.producerconsumer;

public class Consumer implements Runnable{

    private String name;
    private Storage storage = null;

    public Consumer(String name, Storage storage){
        this.name = name;
        this.storage = storage;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(name+"准备消费产品");
            try {
                Product p = storage.pop();
                System.out.println(name+"已消费（"+p.toString()+"）.");
                System.out.println("============");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
