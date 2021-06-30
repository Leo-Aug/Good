public class Cookie extends Good {
    public Cookie(){
        super(5);
    }

    public Cookie(double price){
        super(price);
    }

    public void print_price(){
        System.out.println("饼干的价格为：" + price + " 每盒");
    }
}