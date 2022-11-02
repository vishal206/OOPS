package Polymorphism;

class Addit{

    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
}

class Method_overloading{

    public static void main(String[] args) {
        Addit a=new Addit();
        a.add(1,2);
        a.add(1,2,3);
        a.add(1,2.5);
    }
}