public class T_2023_aviv_A_Q3 {

}

class Fruit {
    protected int weight;

    public Fruit(int val) {
        weight = val;
    }

    public int getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    private String color;

    public Apple(int val, String col) {
        super(val);
        color = col;
    }

    public boolean validWeight() {
        return weight > 80 && weight < 140;
    }

    public static void main(String[] args) {
        Fruit first = new Apple(100, "RED");
        Fruit second = new Fruit(90);
        Apple third = new Apple(100, "RED");
        System.out.println("T_2023_aviv_A_Q3 run!");

        Object[] arr = new Object[3];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;

        checkOfListType(arr);

//        boolean b = first.validWeight(); // --> compile exception because is type of Fruit (and if we want to down casting is can do it explicit)
//        boolean b1 = second.validWeight(); //--> compile exception because is type of Fruit
        boolean b2 = ((Apple) first).validWeight(); // --> is fine and legal
//        boolean b3= ((Apple) second).validWeight(); // --> is runtime exception because a building can be legal bat second no type of Apple
        boolean b4 = ((Apple) first).color.equals(third.color); // --> is legal

    }

    public static void checkOfListType(Object[] arr) {
        int typeApple = 0;
        int typeFruitWithoutApple = 0;
        int typeNotFruit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Apple) {
                typeApple++;
            } else if (arr[i] instanceof Fruit && !(arr[i] instanceof Apple)) {
                typeFruitWithoutApple++;
            } else if (!(arr[i] instanceof Fruit)) {
                typeNotFruit++;
            }
        }
        System.out.println("typeApple : " + typeApple);
        System.out.println("typeFruitWithoutApple : " + typeFruitWithoutApple);
        System.out.println("typeNotFruit : " + typeNotFruit);
    }
}
