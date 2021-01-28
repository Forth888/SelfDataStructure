package someTrain.producerconsumer;

public class Product{

    private int id;

    public Product(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "产品"+this.id;
    }
}
