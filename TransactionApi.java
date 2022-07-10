import java.util.Date;

public class TransactionApi {

    private String name;
    private long cardNum;
    private int cvc;
    private Date expiryDate;

    public void setName(String newName) {
        try {
            this.name = newName;
            if (this.name.length() > 50) {
                throw new Exception("Invalid name");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCardNum(long newNum) {
        try {
            this.cardNum = newNum;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCvc(int newCvc) {
        try {
            this.cvc = newCvc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setExpiryDate(Date newExpiry) {
        try {
            this.expiryDate = newExpiry;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
