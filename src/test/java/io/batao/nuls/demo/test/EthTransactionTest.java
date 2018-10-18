package io.batao.nuls.demo.test;

import org.ethereum.EthTransaction;
import org.ethereum.Transaction;
import org.ethereum.utils.HexUtils;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by wangkun23 on 2018/10/18.
 */
public class EthTransactionTest {
    /**
     * 以太坊签名
     */
    @Test
    public void sign() {
        String to = "";
        BigInteger amount = BigInteger.valueOf(1);
        BigInteger nonce = BigInteger.valueOf(1);
        BigInteger gasPrice = BigInteger.valueOf(2100);
        BigInteger gasLimit = BigInteger.valueOf(2100);
        Integer chainId = 100;

        //首先通过一定方式获取 nonce 填入预定的 gasPrice、gasLimit
        Transaction transaction = EthTransaction.create(to, amount, nonce, gasPrice, gasLimit, chainId);

        //byte[] signByte = transaction.sign(master);
        //String signTx = HexUtils.toHex(signByte);
    }
}
