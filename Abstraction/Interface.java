package Abstraction;

interface Car{
    void brand();
}

class Audi implements Car{
    public void brand(){
        System.out.println("It is a Audi");
    }
}
class Interface {
    public static void main(String[] args) {
        Audi a=new Audi();
        a.brand();
    }
}
