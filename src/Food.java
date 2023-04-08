public class Food {
    public void prepare(){
        System.out.println("Preparing food");
    }
}

class Pizza extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    public static void main(String[] args) {
        Food food = new Pizza();
        food.prepare();
    }
}