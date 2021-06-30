public abstract class Good {
    protected double price;
    public Good(){
        price = 0;
    }
    public Good(double price){
        this.price = price;
    }

    public abstract void print_price();
}
