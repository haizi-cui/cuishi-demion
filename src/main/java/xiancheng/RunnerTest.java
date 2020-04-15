package xiancheng;

public class RunnerTest {
    public static void main(String[] args) {

        Runner_Test runner_test = new Runner_Test();
        Thread thread = new Thread(runner_test);
        thread.start();
    }
}
