class Animal extends Thread {
    
    int priority;
    String name;
    
    public Animal(String name,int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    public void run() {
        for(int i = 0; i <= 1000; i+=100){
            Animal.currentThread().setPriority(priority);
            System.out.println(name + " - " + i + " метров");
        }
    }
}

public class Main {
    public static void main(String args[]){
        System.out.println("Lets go!");
        Animal rabbit = new Animal("Кролик", 5);
        Animal turtle = new Animal("Черепаха", 5);
        rabbit.start();
        turtle.start();
    }
}

