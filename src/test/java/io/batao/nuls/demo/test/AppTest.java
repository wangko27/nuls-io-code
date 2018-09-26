package io.batao.nuls.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
/**
 * Created by wangkun23 on 2018/9/6.
 */
public class AppTest {

    public static void main(String[] args) {
        String json = "[{\"event\":\"VoteCreateEvent\",\"payload\":{\"voteId\":\"1\",\"title\":\"wql123\",\"desc\":\"321\",\"items\":\"[{id: 1, content: \\\"123\\\"}, {id: 2, content: \\\"dsf\\\"}, {id: 3, content: \\\"23\\\"}, {id: 4, content: \\\"124\\\"}, {id: 5, content: \\\"32\\\"}, {id: 6, content: \\\"3\\\"}]\"}}]";
        JSON.parseArray(json);
    }
}
