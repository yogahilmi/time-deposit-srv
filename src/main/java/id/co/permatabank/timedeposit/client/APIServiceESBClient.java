package id.co.permatabank.timedeposit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@FeignClient(value = "api-service-esb", url = "${client.api-service-esb.URL}")
public interface APIServiceESBClient {

    @PostMapping("/timedeposit/TimeDepositDetailOnlineByGCNInq")
    String getTimeDepositDetailOnlineByGCNInq(@RequestBody HashMap<String, String> hRequest);

}
