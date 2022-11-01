package Inheritance;
class Inheritance_basic{
    String company="google";
}

class Developer extends Inheritance_basic{
    int sal=1000;

    public static void main(String[] args){
        Developer vishal=new Developer();
        System.out.println("company: "+vishal.company);
        System.out.println("Salary: "+vishal.sal);

    }
}

