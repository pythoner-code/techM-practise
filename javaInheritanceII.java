//created classes which are not public
class Airthmetic {
    public int add(int a, int b) {
        return a + b;
    }
}
//adder class inheriting Airthmetic class
class adder extends Airthmetic{

    }
    public class javaInheritanceII{
    public static void main(String[] args) {
        adder b = new adder(); //creating object of adder class to access add method
        System.out.println("The superclass is:" + b.getClass().getSuperclass().getName());
        System.out.println(b.add(2, 3));
    }
    
}
