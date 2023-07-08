package factoryExample;

public class Reebok implements Shoes{
    public double price ;
    public String color;

    public Reebok(Double price, String color){
        this.color=color;
        this.price=price;
    }
    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getColor() {
        return color;
    }
}
