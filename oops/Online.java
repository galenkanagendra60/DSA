import java.util.Scanner;

import oops.Cart;
class Online
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product("oppo",25000,19,101);
        Product p2 = new Product("realme",40000,9,102);
        Product p3 = new Product("info",55000,15,103);
        Product p4 = new Product("oppo",35000,13,104);
        Cart cart1  = new Cart();
        System.out.println("*******************");
        System.out.println("** 01.view products **");
        System.out.println("** 02.view cart **");
        System.out.println("** 03.addcart **");
        System.out.println("*******************");
        while (true) { 
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                p1.display();
                p2.display();
                p3.display();
                p4.display();
                break;
            case 2: 
                    cart1.viewcart();
                    break;
            case 3:
                   System.out.println("Enter the id :");
                   int id = sc.nextInt();
                   if (id==101) {
                       cart1.addcart(p1);
                   }
                   if (id==102) {
                       cart1.addcart(p2);
                   }
                   if (id==103) {
                       cart1.addcart(p3);
                   }
                   if (id==104) {
                       cart1.addcart(p4);
                   }
                   break;
            case 4: 
                System.out.println("Invalid choice :");
                System.exit(0);
            default:
                throw new AssertionError();
        }
            

        }
        

    }
}