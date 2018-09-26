package io.batao.nuls.demo.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by wangkun23 on 2018/9/13.
 */
public class RestTemplateTest {

    Logger logger = LoggerFactory.getLogger(RestTemplateTest.class);

    private RestTemplate restTemplate;

    @Before
    public void init() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void vote() {
        String hash = "0020afbefd5a1ada341381f671e7a62afa8fb596691721418cf9b01ee5ce82cf9737";
        String url = "http://192.168.1.107:8001/api/contract/tx/" + hash;
        JSONObject result = restTemplate.getForObject(url, JSONObject.class);
        logger.info("result: {}", result);
        JSONObject data = result.getJSONObject("data");
        JSONObject txData = data.getJSONObject("txData").getJSONObject("data");
        String address = txData.getString("contractAddress");
        String methodName = txData.getString("methodName");

        String sender = txData.getString("sender");
        JSONArray args = txData.getJSONArray("args");
        Long contractVoteId = args.getJSONArray(0).getLong(0);
        List<Long> itemIds = args.getJSONArray(1).toJavaList(Long.class);

        logger.info("address: {}", address);
        logger.info("methodName: {}", methodName);
        logger.info("sender: {}", sender);
        logger.info("contractVoteId: {}", contractVoteId);
        logger.info("itemIds: {}", itemIds);
    }
}
