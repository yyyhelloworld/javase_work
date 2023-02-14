package innerclass;

public class Test02 {
    private static Integer i1=10;
    private static class Test02Inner{
        private Integer i11=110;

        private void printInner()
        {
            System.out.println(i1);
            System.out.println("testInner");
        }
    }

    public static void main(String[] args) {

        Test02Inner test02Inner = new Test02Inner();
    }
}
