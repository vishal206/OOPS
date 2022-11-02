package Polymorphism;

class Vehicle{
    void startit(){
        System.out.println("Start ur vehicle");
    }
}

class Bike extends Vehicle{
    void startit(){
        System.out.println("Start ur bike");
    }
}

class Method_overriding  {
    public static void main(String[] args) {
        bike b=new bike();
        b.startit();
    }
}
