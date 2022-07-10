import java.util.Date;

public class TransactionApiTest {


    private void postDataTest() {
        TransactionApi test = new TransactionApi();
        test.postData("valid name", 1234123412, 234, new Date(2023, 10, 28));
    }
}
