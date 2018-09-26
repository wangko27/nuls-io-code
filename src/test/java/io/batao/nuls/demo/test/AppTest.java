package io.batao.nuls.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangkun23 on 2018/9/6.
 */
public class AppTest {
    static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    /*private static DBService dbService;

    @Before
    public void init() {
        dbService = new LevelDBServiceImpl();
    }

    @Test
    public void test() throws NulsException {
        byte[] heightBytes = new VarInt(100).encode();
        byte[] hashBytes = dbService.get(ProtocolStorageConstant.DB_NAME_BLOCK_HEADER_INDEX, heightBytes);
        byte[] bytes = dbService.get(ProtocolStorageConstant.DB_NAME_BLOCK_HEADER, hashBytes);

        BlockHeaderPo po = new BlockHeaderPo();
        po.parse(bytes, 0);
        logger.info("data ## {}",po);

        NulsDigestData hash = new NulsDigestData();
        try {
            hash.parse(hashBytes, 0);
        } catch (NulsException e) {
            Log.error(e);
        }
        logger.info("data ## {}",hash);
    }*/
}
