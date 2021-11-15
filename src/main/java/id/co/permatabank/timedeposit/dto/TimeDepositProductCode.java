package id.co.permatabank.timedeposit.dto;

import java.math.BigDecimal;
import java.util.Date;

public class TimeDepositProductCode {

	public static final String PNETTIMEDEPOSITPRODUCTKY = new String("PNETTIMEDEPOSITPRODUCTKY");
	public static final String TDCODE = new String("TDCODE");
	public static final String PRODUCTCODE = new String("PRODUCTCODE");
	public static final String CURRENCY = new String("CURRENCY");
	public static final String TENOR = new String("TENOR");
	public static final String MINAMT = new String("MINAMT");
	public static final String MAXAMT = new String("MAXAMT");
	public static final String INTEREST_TERM = new String("INTEREST_TERM");
	public static final String WHCODE = new String("WHCODE");
	public static final String INTEREST_DISPOSITION = new String("INTEREST_DISPOSITION");
	public static final String INTEREST_RENEWAL = new String("INTEREST_RENEWAL");
	public static final String CREATEDDATE = new String("CREATEDDATE");
	public static final String CREATEDBY = new String("CREATEDBY");
	public static final String ISDELETE = new String("ISDELETE");
	public static final String FAILEDCOUNT = new String("FAILEDCOUNT");
	public static final String LASTINPUTDTTM = new String("LASTINPUTDTTM");
	public static final String UPDATEDTTM = new String("UPDATEDTTM");
	public static final String UPDATEUSER = new String("UPDATEUSER");
	public static final String UPDATESYSTEM = new String("UPDATESYSTEM");
	public static final String VERSIONSTAMP = new String("VERSIONSTAMP");
    
    private int pnettimedepositproductky;
	private String tdcode;
	private String productcode;
	private String currency;
	private int tenor;
	private BigDecimal minamt;
	private BigDecimal maxamt;
	private int interestterm;
	private int whcode;
	private String interestdisposition;
	private String interestrenewal;
	private Date createddate;
	private String createdby;
	private int isdelete;
	private int failedcount;
	private Date lastinputdttm;
	private Date updatedttm;
	private String updateuser;
	private String updatesystem;
	private int versionstamp;

    public int getPnettimedepositproductky() {
        return pnettimedepositproductky;
    }
    public void setPnettimedepositproductky(int pnettimedepositproductky) {
        this.pnettimedepositproductky = pnettimedepositproductky;
    }
    public String getTdcode() {
        return tdcode;
    }
    public void setTdcode(String tdcode) {
        this.tdcode = tdcode;
    }
    public String getProductcode() {
        return productcode;
    }
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public int getTenor() {
        return tenor;
    }
    public void setTenor(int tenor) {
        this.tenor = tenor;
    }
    public BigDecimal getMinamt() {
        return minamt;
    }
    public void setMinamt(BigDecimal minamt) {
        this.minamt = minamt;
    }
    public BigDecimal getMaxamt() {
        return maxamt;
    }
    public void setMaxamt(BigDecimal maxamt) {
        this.maxamt = maxamt;
    }
    public int getInterestterm() {
        return interestterm;
    }
    public void setInterestterm(int interestterm) {
        this.interestterm = interestterm;
    }
    public int getWhcode() {
        return whcode;
    }
    public void setWhcode(int whcode) {
        this.whcode = whcode;
    }
    public String getInterestdisposition() {
        return interestdisposition;
    }
    public void setInterestdisposition(String interestdisposition) {
        this.interestdisposition = interestdisposition;
    }
    public String getInterestrenewal() {
        return interestrenewal;
    }
    public void setInterestrenewal(String interestrenewal) {
        this.interestrenewal = interestrenewal;
    }
    public Date getCreateddate() {
        return createddate;
    }
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
    public String getCreatedby() {
        return createdby;
    }
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
    public int getIsdelete() {
        return isdelete;
    }
    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
    public int getFailedcount() {
        return failedcount;
    }
    public void setFailedcount(int failedcount) {
        this.failedcount = failedcount;
    }
    public Date getLastinputdttm() {
        return lastinputdttm;
    }
    public void setLastinputdttm(Date lastinputdttm) {
        this.lastinputdttm = lastinputdttm;
    }
    public Date getUpdatedttm() {
        return updatedttm;
    }
    public void setUpdatedttm(Date updatedttm) {
        this.updatedttm = updatedttm;
    }
    public String getUpdateuser() {
        return updateuser;
    }
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }
    public String getUpdatesystem() {
        return updatesystem;
    }
    public void setUpdatesystem(String updatesystem) {
        this.updatesystem = updatesystem;
    }
    public int getVersionstamp() {
        return versionstamp;
    }
    public void setVersionstamp(int versionstamp) {
        this.versionstamp = versionstamp;
    }
    
}
