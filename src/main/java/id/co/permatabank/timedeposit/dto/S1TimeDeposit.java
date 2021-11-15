package id.co.permatabank.timedeposit.dto;

public class S1TimeDeposit {
	public static final String TIMEDEPOSIT_NO = new String("TIMEDEPOSITNO");
	public static final String FROM_ACCOUNT = new String("FROM_ACCOUNT");
	public static final String ARO_ACCOUNT = new String("ARO_ACCOUNT");
    
    private String timeDepositNo;
	private String fromAccount;
	private String aroAccount;
    
    public String getTimeDepositNo() {
        return timeDepositNo;
    }
    public void setTimeDepositNo(String timeDepositNo) {
        this.timeDepositNo = timeDepositNo;
    }
    public String getFromAccount() {
        return fromAccount;
    }
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    public String getAroAccount() {
        return aroAccount;
    }
    public void setAroAccount(String aroAccount) {
        this.aroAccount = aroAccount;
    }

    
}
