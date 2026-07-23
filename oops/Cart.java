

import java.util.ArrayList;

import Product;

class Cart
{
    ArrayList<Product>cart1= new ArrayList<>();

    void addcart(Product product)
    {
        cart1.add(product);
        System.out.println(product.getitem()+"Item is Add successfully !!!");
    }
    void viewcart()
    {
        if(cart1.isEmpty())
        {
            System.out.println("The Cart is Empty !!!");

        }
        int total=0;
        System.out.println("----- Shopping cart -----");
        for(Product p:cart1)
        {
            System.out.println(p.getitem()+" "+ p.getstock()+" "+p.getid()+" ");

        
        total=total+p.getprice();
        }
        System.out.println("***********************");
        System.out.println("Total :"+total);
    } 
}