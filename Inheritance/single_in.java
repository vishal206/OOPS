package Inheritance;

class single_in {
    void name(){
        System.out.println("Vishal");
    }
}

class Subclass extends single_in{
    void age(){
        System.out.println("22");
    }

    public static void main(String[] args) {
        Subclass s=new Subclass();
        s.name();
        s.age();
    }
}
