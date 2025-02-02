import org.testng.annotations.Test;

public class HelloTest {
        @Test
        public void HTest()
        {
                for (int i = 1; i <= 5; i++) {
                        System.out.println("i = " + i);
                }
        }
}
