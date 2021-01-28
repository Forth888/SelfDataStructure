package someTrain.producerconsumer;

public class Producer implements Runnable {

    private String name;
    private Storage s = null;

    public Producer(String name, Storage s){
        this.name = name;
        this.s = s;
    }

    @Override
    public void run() {
        while(true){
            Product product = new Product((int)(Math.random()*10000));

            System.out.println(this.name+"准备生产（"+product.toString()+"）.");
            try {
                s.push(product);
                System.out.println(this.name+"已生产（"+product.toString()+"）.");
                System.out.println("===============");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
