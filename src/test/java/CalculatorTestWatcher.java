import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class CalculatorTestWatcher implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("test disable now ,the reason is: "+reason.orElse("no reason"));
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("test "+context.getDisplayName()+ " run successfully");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("test "+context.getDisplayName()+ " failed, ERROR:"+cause.getMessage());
    }

}
