/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc. 
    Modified by P. Prasad 2023

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.

    Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
    Modified by P. Prasad 2023
    
    Prasad Paranjape, CIS 505  September 2023
    ProductDB.java class to represent the bowling shops database
 */

package Module_4.BowlingShopApp;

public class ProductDB {

    /**
     * Method to create the different types of the products
     *
     * @param code String
     * @return GenericQueue<Product>
     */
    public static GenericQueue<Product> getProducts(String code) {
        if (code.equalsIgnoreCase("b")) { // Define the ball product
            GenericQueue<Product> balls = new GenericQueue<Product>();
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 1.0");
            ball1.setPrice(99.99);
            ball1.setColor("Black and Red");
            balls.enqueue(ball1);

            Ball ball2 = new Ball();
            ball2.setCode("B200");
            ball2.setDescription("Blue 2.0");
            ball2.setPrice(88.88);
            ball2.setColor("Blue");
            balls.enqueue(ball2);

            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("White Summer");
            ball3.setPrice(77.77);
            ball3.setColor("White");
            balls.enqueue(ball3);

            Ball ball4 = new Ball();
            ball4.setCode("B400");
            ball4.setDescription("Black Cat");
            ball4.setPrice(200.01);
            ball4.setColor("Black");
            balls.enqueue(ball4);

            Ball ball5 = new Ball();
            ball5.setCode("B500");
            ball5.setDescription("Neutral Gray");
            ball5.setPrice(300.99);
            ball5.setColor("Black and White");
            balls.enqueue(ball5);

            return balls;
        } else if (code.equalsIgnoreCase("s")) { // Define the shoe product
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Basic");
            shoe1.setPrice(10.99);
            shoe1.setSize(5.0);
            shoes.enqueue(shoe1);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setDescription("Beginner");
            shoe2.setPrice(20.99);
            shoe2.setSize(6.0);
            shoes.enqueue(shoe2);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Intermediate");
            shoe3.setPrice(30.99);
            shoe3.setSize(7.0);
            shoes.enqueue(shoe3);

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setDescription("Advanced");
            shoe4.setPrice(40.99);
            shoe4.setSize(8.0);
            shoes.enqueue(shoe4);

            Shoe shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setDescription("Expert");
            shoe5.setPrice(50.99);
            shoe5.setSize(9.0);
            shoes.enqueue(shoe5);

            return shoes;

        } else if (code.equalsIgnoreCase("a")) { // Define the bag product
            GenericQueue<Product> bags = new GenericQueue<Product>();
            Bag bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("Small bag");
            bag1.setPrice(60.88);
            bag1.setType("Small");
            bags.enqueue(bag1);

            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Medium bag");
            bag2.setPrice(61.88);
            bag2.setType("Medium");
            bags.enqueue(bag2);

            Bag bag3 = new Bag();
            bag3.setCode("A300");
            bag3.setDescription("Large bag");
            bag3.setPrice(62.77);
            bag3.setType("Large");
            bags.enqueue(bag3);
            return bags;

        } else {
            GenericQueue<Product> empty = new GenericQueue<Product>(); // Define the empty product
            empty.enqueue(new Product());
            return empty;
        }
    } // end getProducts

} // end ProductDB class