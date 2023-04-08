public class Animal {
    void eat (){

    }
}
class dog extends Animal {
    @Override
    void eat() {
        System.out.println("Eating Any Food!");
    }
}
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Eating Meet Only!");
    }
}
class RunCode {
    public static void main(String[] args) {
        Animal d = new dog();
        Animal l = new Lion();
        d . eat();
        l . eat();
    }
}