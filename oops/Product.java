class Product
{
    private String item;
    private int price;
    private int stock;
    private int id;
    Product(String item,int price,int stock,int id)
    {
        this.price = price;
        this.item= item;
        this.stock = stock;
        this.id= id;
    }
    String getitem()
    {
        return item;
    }
    int getprice()
    {
        return price;
    }
    int getstock()
    {
        return stock;
    }
    int getid()
    {
        return id;
    }
    void display()
    {
        System.out.println("*********************");
        System.out.println("ID :"+id);
        System.out.println("ITEM :"+item);
        System.out.println("PRICE :"+price);
        System.out.println("STOCK:"+stock);
        System.out.println("*********************");
    }
}