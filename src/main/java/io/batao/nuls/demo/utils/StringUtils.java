/**
 * MIT License
 * <p>
 * Copyright (c) 2017-2018 nuls.io
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.batao.nuls.demo.utils;

import io.batao.nuls.demo.NulsConfig;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niels on 2017/10/9.
 */
public class StringUtils {

    private static Pattern pattern = Pattern.compile("[0-9]{1,}");

    public static boolean isBlank(String str) {
        return null == str || str.trim().length() == 0;
    }

    public static boolean isNull(String str) {
        return null == str || str.trim().length() == 0 || "null".equalsIgnoreCase(str.trim());
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

    public static String getNewUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * Check the difficulty of the password
     * length between 8 and 20, the combination of characters and numbers
     *
     * @param password
     * @return boolean
     */
    public static boolean validPassword(String password) {
        if (isBlank(password)) {
            return false;
        }
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        if (password.matches("(.*)[a-zA-z](.*)") && password.matches("(.*)\\d+(.*)")) {
            return true;
        } else {
            return false;
        }
    }

    private static final int HASH_LENGTH = 23;

    public static byte[] bytes(String value) {
        return (value == null) ? null : value.getBytes(StandardCharsets.UTF_8);
    }


    protected static void checkXOR(byte[] hashs) {
        byte[] body = new byte[22];
        System.arraycopy(hashs, 0, body, 0, 22);

        byte xor = 0x00;
        for (int i = 0; i < body.length; i++) {
            xor ^= body[i];
        }
        byte[] sign = new byte[1];
        System.arraycopy(hashs, 22, sign, 0, 1);

        if (xor != hashs[22]) {
            throw new RuntimeException();
        }
    }

    public static boolean validHash(String hash) {
        if (isBlank(hash)) {
            return false;
        }
        /*修改于2018-06-05 因为新版本的hash长度为68位，现在的判断是
        if (hash.length() != 70) {
            return false;
        }
        导致验证不过，此处改成长度小于100即可
        */
        if (hash.length() > 100) {
            return false;
        }
        return true;
    }


    public static byte caculateXor(byte[] data) {
        byte xor = 0x00;
        if (data == null || data.length == 0) {
            return xor;
        }
        for (int i = 0; i < data.length; i++) {
            xor ^= data[i];
        }
        return xor;
    }

    private static final Pattern NUMBER_PATTERN = Pattern.compile("[1-9]\\d*|0");

    public static boolean isNonNegativeInteger(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        Matcher isNum = NUMBER_PATTERN.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 验证是否包含特殊字符 true为包含，false为不包含
     * @param str 要验证的字符串
     * @return
     */
    public static boolean isSpecialChar(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

    /**
     * 验证别名是否合法
     * @param str
     * @return
     */
    public static boolean valiAlias(String str) {
        String regEx = "^[a-z0-9]{1}[a-z0-9_]{0,98}[a-z0-9]{1}$";
        return str.matches(regEx);
        /*Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();*/
    }

    /**
     * 验证字符串是否为数字
     * @param str
     * @return
     */
    public static boolean valiNumber(String str) {
        Matcher matcher = pattern.matcher((CharSequence) str);
        return matcher.matches();
    }

    public static boolean validTxRemark(String remark) {
        if (StringUtils.isBlank(remark)) {
            return true;
        }
        try {
            byte[] bytes = remark.getBytes(NulsConfig.DEFAULT_ENCODING);
            if (bytes.length > 100) {
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

}
