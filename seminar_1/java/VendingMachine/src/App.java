import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.Product;
import Services.CoinDispencer;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(120, 14, "Nuts", 1235);
        Product item3 = new Product(80, 16, "Chips", 1236);
        Product item4 = new Product(20, 18, "Milka", 1237);
        Product item5 = new Product(60, 1, "3korochki", 1238);
        Product item6 = new Product(90, 2, "Snikers", 1239);
        Product item7 = new Bottle(150, 3, "Cola", 1240, 0.5f);

        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display disp = new Display();
        List<Product> lisProd = new ArrayList<>();

        lisProd.add(item1);
        lisProd.add(item2);
        lisProd.add(item3);
        lisProd.add(item4);
        lisProd.add(item5);
        lisProd.add(item6);
        lisProd.add(item7);// это полифморфизм (использовали потомка, как экземпляр класса родителя)

        VendingMachine vm = new VendingMachine(hold, coin, disp, lisProd);

        for(Product p: vm.getAssort()){
            System.out.println(p);
        }
        // System.out.println(item7);


        

    }
}
