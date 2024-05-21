public class T_2022_summer_A_Q3 {
    public class A {
        protected int x;

        public A() {
            x = 0;
        }

        public void method(int num) {
            x += num;
        }

        public String toString() {
            return "" + x;
        }
    }// end of class A

    public class B extends A {
        private int y;

        public B() {
            super();
            y = 1;
        }

        public void method(int num) {
            x -= num;
            y += num;
        }

        public String toString() {
            return "" + x + "." + y;
        }
    }// end of class B

    public class C extends A {
        private int y;

        public C() {
            super();
            y = 10;
        }

        public void method(int num) {
            x += num;
            y += num;
        }

        public String toString() {
            return "" + x + "/" + y;
        }
    } // end of class C

//    public static void main(String[] args) {
//        A [] array = new A[4];
//        array[0] = new C();
//        array[1] = new B();
//        array[2] = new A();
//        array[3] = new B();
//
//        for (int i = 0; i < array.length; i ++)
//        {
//            System.out.println ("array[" + i + "] = " + array[i]);
//            array[i].method(i+2);
//            System.out.println ("array[" + i + "] = " + array[i]);
//        }
//
//    }


}
