package project5;

public class Product {

    private int quantity;
    private String barCode;

    public Product(int quantity, String barCode) {
        this.quantity = quantity;
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /*
    public boolean equals(Product obj){

        return this.barCode == obj.getBarCode();
    }
    */
}

