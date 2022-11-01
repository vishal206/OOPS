package Inheritance;

class Animal{
    void eat(){
        System.out.println("eat thissss");
    }
}

class Dog extends Animal{
    void doggy(){
        System.out.println("Can I be ur puppy!");
    }
}

class Cat extends Animal{
    void catgirl(){
        System.out.println("Be my cat girl..meow");
    }
}

class Hierarchical  {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.catgirl();
        c.eat();
        // c.doggy()  -- this wont work - compile time error
    }
}
