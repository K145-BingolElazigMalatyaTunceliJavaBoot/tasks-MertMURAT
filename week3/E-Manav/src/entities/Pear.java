package entities;

public class Pear extends Fruit {


    public Pear() {
        super(fruitName, kilogram, price);
    }

    @Override
    public String fruitName() {
        return "Armut";
    }

    @Override
    public int kilogram() {
        return kilogram = 30;
    }

    @Override
    public double price() {
        return price = 22;
    }
}
