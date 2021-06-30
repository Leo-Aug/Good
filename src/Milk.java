public class Milk extends Good {
    public Milk(){
        super(3);
    }

    public Milk(double price){
        super(price);
    }

    public void print_price(){
        System.out.println("牛奶的价格为：" + price + " 每瓶");
    }
}
