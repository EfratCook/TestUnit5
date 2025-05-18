import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@ExtendWith(CalculatorExtension.class)

public class CalculatorTest {
    static Calculator calc ;
    @BeforeAll
    public static void initAll() {
        System.out.println("Before all tests");
    }
    @BeforeEach
    public void init() {
        calc = new Calculator();
        System.out.println("Before each test");
    }
    @ParameterizedTest
    @CsvSource({
            "5,2",
            "8 ,2",
            "10,5"
    })
   void testDivide(int a, int b) {
        calc.divide(a, b);
        System.out.println("the result of divide the numbers "+a+" by "+b+" is: "+calc.divide(a, b));
    }
    @ParameterizedTest
    @CsvSource({
            "4,2",
            "8 ,2",
            "9,3"
    })
    void testSubtract(int a, int b) {
        calc.subtract(a, b);
        System.out.println("the result of subtract the numbers "+a+" by "+b+" is: "+calc.subtract(a, b));
    }
    @ParameterizedTest
    @CsvSource({
            "20,2",
            "12 ,5",
            "15,5"
    })
    void testMultiply(int a, int b) {
        calc.multiply(a, b);
        System.out.println("the result of multiply the numbers "+a+" by "+b+" is: "+calc.multiply(a, b));
    }
    @ParameterizedTest
    @CsvSource({
            "9,2",
            "7 ,2",
            "5,5"
    })
    void testAdd(int a, int b) {
        calc.add(a, b);
        System.out.println("the result of add the numbers "+a+" by "+b+" is: "+calc.add(a, b));
    }
    @AfterEach
    public void tearDown() {
        System.out.println("After each test");
    }
    @AfterAll
    public static void tearDownAll() {
        System.out.println("After all tests");

    }
}
