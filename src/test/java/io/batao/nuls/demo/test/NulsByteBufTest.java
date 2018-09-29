package io.batao.nuls.demo.test;

import org.junit.Test;

import java.util.Base64;

/**
 * Created by wangkun23 on 2018/9/29.
 */
public class NulsByteBufTest {

    @Test
    public void read() {
        String sign = "2103fcf744f9cfd6fde47fd49ecdb43b82bfc2f3a241006b9825512546e6dfdb928400473045022100c0ea81fe3fcb73aca950aa67e20af9e7f89249d8f31e9e9e8cd27130be41a5c3022005d12d0f339a90a37605c7383877672fc620baf115fca3eeebc0475ee3881d46";
        byte[] data = Base64.getDecoder().decode(sign);


    }
}
