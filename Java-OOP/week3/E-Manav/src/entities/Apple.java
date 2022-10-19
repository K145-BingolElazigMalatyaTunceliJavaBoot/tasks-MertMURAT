package entities;

public class Apple extends Fruit {


    public Apple() {
        super(fruitName, kilogram, price);
    }

    @Override
    public String fruitName() {
        return fruitName = "Elma";
    }

    @Override
    public int kilogram() {
        return kilogram = 12;
    }

    @Override
    public double price() {
        return price = 16;
    }
}


