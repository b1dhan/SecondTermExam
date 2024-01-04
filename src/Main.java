    import models.Order;
    import models.Tshirt;

    public class Main {
        public static void main(String[] args) {

            //creating separate arrays for our "sizes" to insert into our object as values because arrays cannot be kept as parameters directly
            String[] persize1= {"Small","Medium","Large"};
            String[] persize2= {"Extra Large","Medium","Large"};

            //creating two objects for "Tshirt" class where required values are inserted directly w help of constructors
            Tshirt person1 = new Tshirt("Ram",12345, 1900, "ABCbrand","Color the sides dark red", persize1);
            Tshirt person2 = new Tshirt("Shyam",12346, 2000, "XYZbrand","Write in bright red color: I have no enemies", persize2);
            //calling our custom function
            person1.tshirt_display();
            person2.tshirt_display();

            //making separate arrays for prices
            int[] ordprice1 = {2000,1200,1000};
            int[] ordprice2 = {1250,1200,900};


            //making two objects of "Order" Class where values are inserted w help of constructor
            //here long integer is used for phone number so L suffix is kept 
            Order order1 = new Order("Ghanshyam", 9845681681L,"9129", ordprice1);
            Order order2 = new Order("Sitaram", 9841669669L,"9344", ordprice2);

            //calling custom method
            order1.billdisplayer();
            order2.billdisplayer();

        }
    }
