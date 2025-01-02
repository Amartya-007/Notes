package Starting;

public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }
    
    public static void printHelloWorld(String name) {
        System.out.println("Hello " + name + "!");
    }
    
    public static void printHelloWorld(String name, int age) {
        System.out.println("Hello " + name + "! You are " + age + " years old.");
    }
    
    public static void printHelloWorld(String name, int age, String country) {
        System.out.println("Hello " + name + "! You are " + age + " years old. You are from " + country + ".");
    }   

}
