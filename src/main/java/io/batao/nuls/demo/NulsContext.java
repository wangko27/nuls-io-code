/*
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package io.batao.nuls.demo;

/**
 * 系统上下文，提供核心数据共享、服务访问等功能
 * System context provides core data sharing, service access and other functions.
 *
 * @author Niels
 */
public class NulsContext {

    /**
     * 默认链id（nuls主链）,链id会影响地址的生成，当前地址以“Ns”开头
     * The default chain id (nuls main chain), the chain id affects the generation of the address,
     * and the current address begins with "Ns".8964.
     */
    //public static short DEFAULT_CHAIN_ID = 8964;
    public static short DEFAULT_CHAIN_ID = 8964;

    /**
     * 默认的地址类型，一条链可以包含几种地址类型，地址类型包含在地址中
     * The default address type, a chain can contain several address types, and the address type is contained in the address.
     */
    public static byte DEFAULT_ADDRESS_TYPE = 1;
    /**
     * 智能合约地址类型
     * contract address type
     */
    public static byte CONTRACT_ADDRESS_TYPE = 2;

    /**
     * 多重签名地址
     * contract address type
     */
    public static byte P2SH_ADDRESS_TYPE = 3;

    /*
     *  chain name
     */
    public static String CHAIN_NAME = "NULS";
    /**
     * 更换交易hash算法的高度，默认为空，当协议版本升级到2之后记录区块高度
     */
    public static volatile Long CHANGE_HASH_SERIALIZE_HEIGHT;


//    public static void CacheNulsStatistics(String key, NulsStatistics nulsStatistics){
//        EhcacheUtil.getInstance().put(Constant.TOKEN_CACHE_NAME, key, nulsStatistics);
//    }
//
//    public static NulsStatistics getNulsStatistics(String key){
//        NulsStatistics nulsStatistics = (NulsStatistics)EhcacheUtil.getInstance().get(Constant.TOKEN_CACHE_NAME, key);
//        return nulsStatistics;
//    }
}
