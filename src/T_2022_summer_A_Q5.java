import DataStract.Node;

public class T_2022_summer_A_Q5 {

    public class Clown {
        private String name; // ליצן שם

        public String getName() {
            return name;
        }

        private int weight; // ליצן משקל

        public Clown(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    public class Pyramid {
        protected Node<Clown> lc = null;

        public Pyramid() {
            this.lc = null;
        }

        public boolean isStable() {
            if (lc == null) {
                return true;
            }
            int prevWeight = lc.getValue().getWeight();

            while (lc.getNext() != null) {
                if (prevWeight < lc.getNext().getValue().getWeight()) {
                    return false;
                }
                lc = lc.getNext();
                prevWeight = lc.getValue().getWeight();
            }

            return true;
        }

        public boolean addClown(Clown c) {
            // check if is stable
            if (isStable()) {
                // if the pyramid is empty
                if (lc == null) {
                    lc = new Node<>(c, null); // set lc to the new node
                    return true;
                }
                // if the new clown is heavier than the top clown
                if (c.getWeight() > lc.getValue().getWeight()) {
                    Node<Clown> newHead = new Node<>(c, lc); // set lc to the new node
                    lc = newHead; // set lc to the new head
                    return true;
                }

                Node<Clown> current = lc; // start from the top
                while (current.getNext() != null) {
                    if (current.getNext().getValue().getWeight() < c.getWeight()) {
                        Node<Clown> newNode = new Node<>(c);
                        newNode.setNext(current.getNext());
                        current.setNext(newNode);
                        return true;
                    }
                    current = current.getNext();
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("T_2022_summer_A_Q5");

        T_2022_summer_A_Q5 t = new T_2022_summer_A_Q5();
        Pyramid p = t.new Pyramid(); // יצירת מופע של Pyramid תוך שימוש במופע של T_2022_summer_A_Q5
        Clown c1 = t.new Clown("c 1", 200); // יצירת מופע של Clown תוך שימוש במופע של T_2022_summer_A_Q5
        Clown c2 = t.new Clown("c 2", 210);
        Clown c3 = t.new Clown("c 3", 220);

        p.addClown(c1);
        p.addClown(c2);
        p.addClown(c3);
        while (p.lc.getNext() != null) {
            System.out.println(p.lc.getValue().getWeight());
            p.lc = p.lc.getNext();
        }
    }
}
