/**
 * Created by denis.polish on 4/2/2014.
 */
public class TestStatic {
    private static Integer count = 0;

    boolean value;

    public TestStatic() {
        count++;
        value = true;
        System.out.println(count);
    }

    public static void main(String[] arg) {
        TestStatic t1 = new TestStatic();
        TestStatic t2 = new TestStatic();
    }
}
