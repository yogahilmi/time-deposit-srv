package id.co.permatabank.timedeposit.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

import id.co.permatabank.timedeposit.dto.TimeDepositInterest;
import id.co.permatabank.timedeposit.dto.TimeDepositProductCode;
import id.co.permatabank.timedeposit.dto.S1TimeDeposit;

public class TimeDepositRepository extends SoneDbDAO {

    private final static String SELECT_PRODUCTCODE_BY_TDCODE = "SELECT " + TimeDepositProductCode.PRODUCTCODE + ", " + TimeDepositProductCode.TENOR + ", " + TimeDepositProductCode.ISDELETE + " FROM SONEDBA.PNETTIMEDEPOSITPRODUCTCODE WHERE " + TimeDepositProductCode.ISDELETE + " = 0 AND " + TimeDepositProductCode.TDCODE + " = ?";
    private final static String SELECT_INTEREST_BY_PRODUCTCODE = "SELECT " + TimeDepositInterest.INDICATIVERATE + ", " + TimeDepositInterest.NISBAHBANK + " FROM SONEDBA.PNETTIMEDEPOSITINTEREST WHERE " + TimeDepositInterest.PRODUCTCODE + " = ?";

	private static final SoneTimeDepositResultProcessor resultS1TimeDeposit = new SoneTimeDepositResultProcessor();
    public final static SoneTimeDepositGetProductCodeResultProcessor resultGetProductCode = new SoneTimeDepositGetProductCodeResultProcessor();
    public final static SoneTimeDepositGetInterestRateResultProcessor resultGetInterestRate = new SoneTimeDepositGetInterestRateResultProcessor();
    
    private static class SoneTimeDepositResultProcessor extends AResultProcessor<S1TimeDeposit> {
		@Override
		protected S1TimeDeposit constructRecord(ResultSet rs) throws SQLException, Exception {
			S1TimeDeposit vo = new S1TimeDeposit();
			vo.setTimeDepositNo(rs.getString(S1TimeDeposit.TIMEDEPOSIT_NO));
			vo.setFromAccount(rs.getString(S1TimeDeposit.FROM_ACCOUNT));
			vo.setAroAccount(rs.getString(S1TimeDeposit.ARO_ACCOUNT));
			return vo;
		}
	}

    private static class SoneTimeDepositGetProductCodeResultProcessor extends AResultProcessor<TimeDepositProductCode> {

		@Override
		protected TimeDepositProductCode constructRecord(ResultSet rs) throws SQLException, Exception {
			TimeDepositProductCode vo = new TimeDepositProductCode();
            vo.setProductcode(rs.getString(TimeDepositProductCode.PRODUCTCODE));
            vo.setTenor(rs.getInt(TimeDepositProductCode.TENOR));
            vo.setIsdelete(rs.getInt(TimeDepositProductCode.ISDELETE));
			return vo;
		}
		
	}

    private static class SoneTimeDepositGetInterestRateResultProcessor extends AResultProcessor<TimeDepositInterest> {

		@Override
		protected TimeDepositInterest constructRecord(ResultSet rs) throws SQLException, Exception {
			TimeDepositInterest vo = new TimeDepositInterest();
            vo.setNisbahbank(rs.getBigDecimal(TimeDepositInterest.NISBAHBANK));
            vo.setIndicativerate(rs.getBigDecimal(TimeDepositInterest.INDICATIVERATE));
			return vo;
		}
		
	}

    public List<S1TimeDeposit> getListTimeDepositByListCIF(Set<String> listCIF, StringBuilder message) throws Exception {
		String[] cifs= new String[listCIF.size()];
    	String SELECT_PART_TIMEDEPOSIT_BY_LIST_CIF = "SELECT " + S1TimeDeposit.TIMEDEPOSIT_NO + ", " + S1TimeDeposit.FROM_ACCOUNT + ", " + S1TimeDeposit.ARO_ACCOUNT + " FROM SONEDBA.PNETTIMEDEPOSITDETAIL WHERE CIFNO IN ("+ makePlaceHolders(listCIF.size()-1) +") ";
	   	int i=0; 
	    for (String string : listCIF) {
			string = string.substring(0,string.length()-5);
			cifs[i]=string;
			i++;
		}
	    
	    message.append("QUERYNYA: " + SELECT_PART_TIMEDEPOSIT_BY_LIST_CIF + "\n");
	    message.append("CIFNYA: " + new Gson().toJson(cifs) + " size " + cifs.length + "\n");
	    
		List<S1TimeDeposit> list = executeQuery(resultS1TimeDeposit, "", SELECT_PART_TIMEDEPOSIT_BY_LIST_CIF, cifs);
		if (null == list || list.isEmpty()) {
			return new ArrayList<S1TimeDeposit>();
		}
		return list;
	}

    public List<TimeDepositProductCode> getTDProductCode(String tdCode) throws Exception {
		List<TimeDepositProductCode> list = executeQuery(resultGetProductCode, "", SELECT_PRODUCTCODE_BY_TDCODE, tdCode);
		if(null == list || list.isEmpty()) {
			return null;
		}
		return list;
	}

    public List<TimeDepositInterest> getTDInterestRate(String productCode) throws Exception {
		List<TimeDepositInterest> list = executeQuery(resultGetInterestRate, "", SELECT_INTEREST_BY_PRODUCTCODE, productCode);
		if(null == list || list.isEmpty()) {
			return null;
		}
		return list;
	}

    public String makePlaceHolders(int size) {
		StringBuilder sb = new StringBuilder();
		if(size<1) {
			return "?";
		}else {
			sb.append("?");
			for (int i = 0; i < size; i++) {
				sb.append(",?");
				
			}			
		}
		return sb.toString();
	}
}
