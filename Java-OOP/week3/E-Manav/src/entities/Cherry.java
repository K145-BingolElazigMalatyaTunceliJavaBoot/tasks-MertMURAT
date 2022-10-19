package entities;

public class Cherry extends Fruit {


    public Cherry() {
        super(fruitName, kilogram, price);
    }

    @Override
    public String fruitName() {
        return "Kiraz";
    }

    @Override
    public int kilogram() {
        return kilogram = 40;
    }

    @Override
    public double price() {
        return price = 19;
    }
}
