package id.co.permatabank.timedeposit.util;

public class DepositException {
    private static final long serialVersionUID = 1L;

    private String code;
    private String errorMsg;
    private boolean isFromDb = false;
    private String lang;

    protected DepositException(String cause) {
        super(cause);
    }

    public DepositException(String code, String message){
        super(message);
        this.code = code;
        this.errorMsg = message;
    }

    public DepositException(String cause, String code, String errorMsg, boolean isFromDb, String lang) {
        super(cause);
        this.code = code;
        this.errorMsg = errorMsg;
        this.isFromDb = isFromDb;
        this.lang = lang;
    }

    @Override
    public void setResult(Result result, ResponseCode code) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setResult(Result result) {
       if (isFromDb) {
            setResultFromDB(result);
       } else {
            result.addParam("error_code", getCode());
            result.addParam("message", getErrorMsg());
       }
    }

    private void setResultFromDB(Result result){
        IResponseManager iResponseManager = ResponseManager.getResponseManager();
        String errorMessage = iResponseManager.getErrorMessage(getErrorMsg(), getCode(), lang);
        result.addParam("error_code", getCode());
        result.addParam("message", errorMessage);
    }

    public String getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
