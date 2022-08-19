public class Chocolate extends Cupcake{
    public double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}
