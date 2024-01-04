package models;
public class Order {

    //creating fields for Order class w their respective datatypes
    String name;
    long phonenum;
    String itemcode;
    int[] price;

    //creating constructors for our object
    public Order(String name, long phonenum, String itemcode, int[] price) {
        this.name = name;
        this.phonenum = phonenum;
        this.itemcode = itemcode;
        this.price = price;
    }

    //creating setter and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }


    //creating our own custom method for displaying the bill
    //indexing is used for pulling each price value and for loop is used to add for total
    //vat is included
    //required info is displayed as per the format
    public void billdisplayer(){
        System.out.println("Name: "+ this.name);
        System.out.println("Phone Number: "+ this.phonenum);
        System.out.println("Item Code: "+ this.itemcode);
        double total=0;
        for(int n=0; n<this.price.length; n++){
            total= total + this.price[n];
        }
        double vat= (0.17*total);
        double grandtotal = total+vat;
        System.out.println("Price: "+ grandtotal);
        System.out.println("------------------------------------");
    }
}
