package EstoreApplication;

public class Items {
    private Product product;
    private int quantity;


    public Items(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public void setProduct(Product product){ 
        this.product = product;
    }
    public Product getProduct(){
        return product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
