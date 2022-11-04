package Abstraction;
abstract class Bike{
    abstract void brand();
    void itIs(){
        System.out.println("It is a Bike");
    }
}

class RoyalEnf extends Bike{
    void brand(){
        System.out.println("It is a RoyalEnf Bike");
    }
}

class AbstractClass{
    public static void main(String[] args) {
        RoyalEnf myBike=new RoyalEnf();
        myBike.itIs();
        myBike.brand(); 
    }
}