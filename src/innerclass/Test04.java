package innerclass;

public class Test04 {
    interface  test04inter{
        abstract  void printA();
        int printBReturnf();
    }

    class  Test04in implements  test04inter{
        @Override
        public void printA() {

        }

        @Override
        public int printBReturnf() {
            return 0;
        }
    }

    public static void main(String[] args) {
        test04inter test04inter = new test04inter() {
            @Override
            public void printA() {
                System.out.println(1);
            }

            @Override
            public int printBReturnf() {
                return 2;
            }
        };
        test04inter.printA();

    }
}
