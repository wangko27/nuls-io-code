package io.batao.nuls.demo.test;

import io.batao.nuls.demo.NulsByteBuffer;
import io.batao.nuls.demo.exception.NulsException;
import io.batao.nuls.demo.model.CoinData;
import io.batao.nuls.demo.model.Transaction;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Base64;

/**
 * Created by wangkun23 on 2018/9/29.
 */
public class NulsByteBufTest {

    static final Logger logger = LoggerFactory.getLogger(NulsByteBufTest.class);

    @Test
    public void read() throws NulsException {
        String sign = "2103fcf744f9cfd6fde47fd49ecdb43b82bfc2f3a241006b9825512546e6dfdb928400473045022100c0ea81fe3fcb73aca950aa67e20af9e7f89249d8f31e9e9e8cd27130be41a5c3022005d12d0f339a90a37605c7383877672fc620baf115fca3eeebc0475ee3881d46";
        byte[] data = Base64.getDecoder().decode(sign);
        logger.info("{}", data);

        NulsByteBuffer byteBuffer = new NulsByteBuffer(data);
        int type = byteBuffer.readUint16();
        long time = byteBuffer.readUint48();
        //byte[] remark = byteBuffer.readByLengthByte();
        //CoinData coinData = byteBuffer.readNulsData(new CoinData());

        logger.info("type {}", type);
        logger.info("time {}", time);
        //logger.info("remark {}", remark);
        //logger.info("coinData {}", coinData);
    }
}
