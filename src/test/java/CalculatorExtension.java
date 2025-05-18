import org.junit.jupiter.api.extension.*;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExtension implements BeforeAllCallback, AfterAllCallback {

    // לוג סטטי כדי לאחסן את הפעולות
    public static List<String> log = new ArrayList<>();
    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println("Starting page from extension");
    }

    @Override
    public void afterAll(ExtensionContext context) {
        System.out.println("Ending page from extension");
        log.forEach(System.out::println);
        log.clear();
    }
}


