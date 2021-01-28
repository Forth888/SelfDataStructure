package someTrain;

import java.util.*;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);

        Random rand = new Random();
        for(int i=0;i<7;i++){
            integerPriorityQueue.add(rand.nextInt(100));
        }

        for(int i=0;i<7;i++){

            Integer in = integerPriorityQueue.poll();

            System.out.println("Processing Integer:"+in);

        }

        Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) o1.getId() - o2.getId();
            }
        });

        Set<Customer> set = new TreeSet<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) o1.getId() - o2.getId();
            }
        });

        List<Integer> xx = new ArrayList<>();

        addDataToQueue(customerPriorityQueue);
        pollDataFromQueue(customerPriorityQueue);


    }
    public static Comparator<Customer> idComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return (int) o1.getId() - o2.getId();
        }
    };

    private static void addDataToQueue(Queue<Customer> customerPriorityQueue){
        Random rand = new Random();
        for(int i=0; i<7; i++){

            int id = rand.nextInt(100);
            System.out.println(id+"--------");
            customerPriorityQueue.add(new Customer(id, "Pankaj "+id));

        }
    }

    private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {

        while(true){

            Customer cust = customerPriorityQueue.poll();

            if(cust == null) break;

            System.out.println("Processing Customer with ID="+cust.getId());

        }

    }
}
