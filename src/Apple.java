public class Apple extends Good {
    public Apple(){
        super(1);
    }

    public Apple(double price){
        super(price);
    }

    public void print_price(){
        System.out.println("苹果的价格为：" + price + " 每颗");
    }
}