public class IceBox extends Good {
    public IceBox(){
        super(500);
    }

    public IceBox(double price){
        super(price);
    }

    public void print_price(){
        System.out.println("冰箱的价格为：" + price + " 每件");
    }
}