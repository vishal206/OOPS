package Inheritance;

class multi_lvl_in {
    void name(){
        System.out.println("Vishal");
    }
}
class age extends multi_lvl_in{
    void age(){
        System.out.println("22");
    }

}
class Whatdoing extends age{
    void doing(){
        System.out.println("coding");
    }

    public static void main(String[] args) {
        Whatdoing w=new Whatdoing();
        w.name();
        w.age();
        w.doing();
    }
}
