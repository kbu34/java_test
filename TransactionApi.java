import java.util.Date;

public class TransactionApi {

    private void validateName(String newName) {
        try {
            if (newName != null && newName.length() > 50) {
                throw new Exception("Invalid name");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateCardNum(long newNum) {
        try {
            if (newNum != 0) {
                /// check valid credit cards storage
                throw new Exception("Invalid number");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateCvc(int newCvc) {
        try {
            if (newCvc != (int)newCvc) {
                throw new Exception("Invalid cvc");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateExpiryDate(Date newExpiry) {
        try {
            if (newExpiry != (Date)newExpiry) {
                throw new Exception("Invalid expiry date");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void postData(String newName, long newNum, int newCvc, Date newExpiry) {
        this.validateName(newName);
        this.validateCardNum(newNum);
        this.validateCvc(newCvc);
        this.validateExpiryDate(newExpiry);

        /// dbmodel.postCardData(newName, newNum, newCvc, newExpiry);
    }

    public String getAllData() {
        /// return dbmodel.getAllCardData();
        return "";
    }

    public String getOne(long cardNum) {
        /// return dbmodel.getOneCard(cardNum);
        return "";
    }

}
