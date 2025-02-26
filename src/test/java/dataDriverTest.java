import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class dataDriverTest {
    private int input; // This will be the integer input
    private String expected; // Expected result (String)

    // Constructor
    public dataDriverTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    // Data provider method
    @Parameterized.Parameters
    public static Object[][] dataProviderMethod() {
        return new Object[][] {
                {1, "data1"}, // Correcting inputs so that they match the parameter types and order
                {2, "data2"},
                {3, "data3"}
        };
    }

    // Method to generate results based on input
    private String giveResult(int input) {
        return "data" + input; // Combine "data" and the integer input
    }

    @Test
    public void testMethod() {
        // Test logic here
        Assert.assertEquals(expected, giveResult(input)); // Ensure expected output matches the result
    }
}