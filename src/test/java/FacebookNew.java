import Facebook.Utills.chromerunner;
import Facebook.stepObject.Step;
import org.testng.annotations.Test;

public class FacebookNew extends chromerunner {
    @Test
    public void createAcoount(){
        Step st = new Step();

        st
                .goToCeateAccont()
                .firstName()
                .lastName();

    }
}
