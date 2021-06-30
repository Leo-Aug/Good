import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("请输入要输出价格的商品。");
            System.out.println("1. 牛奶");
            System.out.println("2. 苹果");
            System.out.println("3. 饼干");
            System.out.println("4. 电视");
            System.out.println("5. 冰箱");
            System.out.println("6. 退出");
            System.out.print("请输入：");
            int choice = input.nextInt();
            Good good = null;

            switch(choice){
                case 1:
                    good = new Milk();
                    break;
                case 2:
                    good = new Apple();
                    break;
                case 3:
                    good = new Cookie();
                    break;
                case 4:
                    good = new TV();
                    break;
                case 5:
                    good = new IceBox();
                    break;
                default:
                    exit = true;
                    break;
            }
            if(!exit){
                good.print_price();
            }
        }while(!exit);
    }
}
