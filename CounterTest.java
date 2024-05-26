public class CounterTest {
    public static int count;

    public CounterTest() {
        count++;
    }

    public static void main(String args[]) {
        CounterTest ob1 = new CounterTest();
        System.out.println("Number of objects :" + CounterTest.count);
        CounterTest ob2 = new CounterTest();
        System.out.println("Number of objects :" + CounterTest.count);

        Runtime r = Runtime.getRuntime();
        ob1 = null;
        ob2 = null;
        r.gc();
    }

    protected void finalize() {
        System.out.println("Program about to terminate");
        CounterTest.count--;
        System.out.println("Number of objects :" + CounterTest.count);
    }
}
