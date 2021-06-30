public class TV extends Good {
    public TV(){
        super(300);
    }

    public TV(double price){
        super(price);
    }

    public void print_price(){
        System.out.println("电视的价格为：" + price + " 每件");
    }
}