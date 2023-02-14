package innerclass;

public class Test01 {
    private Integer i;


    private void printIW(){
        System.out.println("printIw");
        System.out.println(i);
    }

    public class Test01Inner {
        private Integer innerInteger = 3;
        private void printIN(){
            System.out.println("---执行内部");
            printIW();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Test01Inner test01Inner = test01.new Test01Inner();
        //System.out.println(test01Inner.innerInteger);
        test01Inner.printIN();
    }
}
