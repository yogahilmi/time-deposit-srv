package id.co.permatabank.timedeposit.util;

import com.konylabs.middleware.controller.DataControllerRequest;
import com.konylabs.middleware.controller.DataControllerResponse;
import com.konylabs.middleware.dataobject.Result;
import com.pmob.kony.exception.PmobException;
import com.pmob.kony.service.ABaseService;
import com.pmob.kony.service.deposit.timedeposit.TimeDeposit;
import com.pmob.kony.util.LogHandler;
import com.pmob.kony.util.PmobConstants;
import com.pmob.kony.util.PmobParamConstants;
import com.pmob.kony.util.ResponseCode;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class DepositService extends ABaseService {

    @Override
    public Object invoke(String serviceId, Object[] parameter, DataControllerRequest request, DataControllerResponse response)
            throws Exception {
        Result result = new Result();
        StringBuilder logging = new StringBuilder();
        Logger logger = LogManager.getLogger(DepositService.class);
        storeStep(request, PmobParamConstants.SESS_USR_NAME, request.getParameter("userid"));
        try {
            setResultFromMap(result, listDeposit(request, logging).getResult(request, logging));
            result.addParam("wfmessage", "wfpmobsuccess");
            setResultCode(result, ResponseCode.SUCCESS);
        } catch (DepositException dex) {
            if(dex.getMessage().equals("Error Get Data Deposit")) {
        		result.addParam("wfmessage", "wfpmoberror");        		
        	}else {
        		result.addParam("wfmessage", "wfpmobsuccess");
        	}
        	 LogHandler.printStack(logger, logging, dex);
        	 dex.setResult(result);
        } catch (PmobException pex) {
        	result.addParam("wfmessage", "wfpmobsuccess");
            LogHandler.printStack(logger, logging, pex);
            pex.setResult(result);
        } catch(Exception e) {
        	result.addParam("wfmessage", "wfpmobsuccess");
            LogHandler.printStack(logger, logging, e);
            setResultCode(result, ResponseCode.GENERAL_ERROR);
        }
        return result;
    }
    
    private Deposit listDeposit(DataControllerRequest request, StringBuilder logging) throws DepositException {
        Deposit deposit = new TimeDeposit(logging);
        return deposit;
    }
}
