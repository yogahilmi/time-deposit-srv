package id.co.permatabank.timedeposit.dto;

import java.math.BigDecimal;
import java.util.Date;

public class TimeDepositInterest {

	public static final String PNETTIMEDEPOSITPRODUCTKY = new String("PNETTIMEDEPOSITPRODUCTKY");
	public static final String PRODUCTCODE = new String("PRODUCTCODE");
	public static final String MINAMT = new String("MINAMT");
	public static final String MAXAMT = new String("MAXAMT");
	public static final String INTEREST = new String("INTEREST");
	public static final String NISBAHBANK = new String("NISBAHBANK");
	public static final String EQRATE = new String("EQRATE");
	public static final String CREATEDDATE = new String("CREATEDDATE");
	public static final String CREATEDBY = new String("CREATEDBY");
	public static final String ISDELETE = new String("ISDELETE");
	public static final String FAILEDCOUNT = new String("FAILEDCOUNT");
	public static final String LASTINPUTDTTM = new String("LASTINPUTDTTM");
	public static final String UPDATEDTTM = new String("UPDATEDTTM");
	public static final String UPDATEUSER = new String("UPDATEUSER");
	public static final String UPDATESYSTEM = new String("UPDATESYSTEM");
	public static final String VERSIONSTAMP = new String("VERSIONSTAMP");
	public static final String INDICATIVERATE = new String("INDICATIVERATE");

    private int pnettimedepositproductky;
	private String productcode;
	private BigDecimal minamt;
	private BigDecimal maxamt;
	private BigDecimal interest;
	private BigDecimal nisbahbank;
	private BigDecimal eqrate;
	private Date createddate;
	private String createdby;
	private int isdelete;
	private int failedcount;
	private Date lastinputdttm;
	private Date updatedttm;
	private String updateuser;
	private String updatesystem;
	private int versionstamp;
	private BigDecimal indicativerate;
    
    public int getPnettimedepositproductky() {
        return pnettimedepositproductky;
    }
    public void setPnettimedepositproductky(int pnettimedepositproductky) {
        this.pnettimedepositproductky = pnettimedepositproductky;
    }
    public String getProductcode() {
        return productcode;
    }
    public void setProductcode(String productcode) {
        this.productcode = productcode;
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
    public BigDecimal getInterest() {
        return interest;
    }
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
    public BigDecimal getNisbahbank() {
        return nisbahbank;
    }
    public void setNisbahbank(BigDecimal nisbahbank) {
        this.nisbahbank = nisbahbank;
    }
    public BigDecimal getEqrate() {
        return eqrate;
    }
    public void setEqrate(BigDecimal eqrate) {
        this.eqrate = eqrate;
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
    public BigDecimal getIndicativerate() {
        return indicativerate;
    }
    public void setIndicativerate(BigDecimal indicativerate) {
        this.indicativerate = indicativerate;
    }

    
}
