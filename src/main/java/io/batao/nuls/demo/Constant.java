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
package io.batao.nuls.demo;

import io.batao.nuls.demo.utils.StringUtils;

/**
 *
 * @author Niels
 * @date 2017/10/9
 */
public interface Constant {
    short DEFAULT_CHAIN_ID = 1;
    //version
    int RPC_MODULE_VERSION = 1111;
    /**
     * Minimum version supported
     */
    int MINIMUM_VERSION_SUPPORTED = 0;

    byte DEFAULT_ADDRESS_TYPE = 1;

    String CFG_SYSTEM_LANGUAGE = "language";
    String DEFAULT_LANGUAGE = "zh-cn";
    String CFG_SYSTEM_DEFAULT_ENCODING = "encoding";
    String DEFAULT_ENCODING = "UTF-8";
    String PACKAGES = "io.nuls.api.server.resources.impl";
    String CFG_RPC_SERVER_IP = "server.ip";
    String CFG_RPC_SERVER_PORT = "server.port";
    String CFG_RPC_SERVER_URL = "server.url";
    int DEFAULT_PORT = 8765;
    String DEFAULT_IP = "0.0.0.0";
    String DEFAULT_URL = "nuls";
    String HTTPS = "https://";
    String HTTP = "http://";
    String URI_SEPARATOR = "/";
    String COLON = ":";

    String CFG_RPC_REMOTE_SERVER_IP = "remote.server.ip";
    String CFG_RPC_REMOTE_SERVER_PORT = "remote.server.port";
    String CFG_RPC_REMOTE_SERVER_URL = "remote.server.url";
    int DEFAULT_REMOTE_PORT = 8001;
    String DEFAULT_REMOTE_IP = "192.168.1.233";
    String DEFAULT_REMOTE_URL = "nuls";
    String DEFAULT_REMOTE_SERVER = HTTP + DEFAULT_REMOTE_IP + COLON + DEFAULT_REMOTE_PORT;

    String REQUEST_FREQUENCY = "request.frequency";
    String DEFAULT_REQUEST_FREQUENCY = "100";
    String INTEGER = "java.lang.Integer";
    String STRING = "java.lang.String";


    int INT48_VALUE_LENGTH = 6;

    String CFG_RPC_SECTION = "api";

    String CFG_RPC_REQUEST_WHITE_SHEET = "request.white.sheet";

    String WHITE_SHEET_SPLIT = ",";

    /**
     * utxo锁定时间分界值
     * 小于该值表示按照高度锁定
     * 大于该值表示按照时间锁定
     */
    long BLOCKHEIGHT_TIME_DIVIDE = 1000000000000L;

    long MILLISECONDS_TIME_DAY = 86400000;

    int SECONDS_TIME_DAY = 86400000;

    int SECONDS_TIME_HOUR_SECOND = 3600;

    int INDEX_BLOCK_LIST_COUNT = 6;
    int INDEX_TX_LIST_COUNT = 5;


    String UTXO_TEMP_CACHE_NAME = "utxoTempCache";
    String ALIAS_CACHE_NAME = "alias";
    String UTXO_CACHE_NAME = "utxoCache";
    String BALANCE_CACHE_NAME = "balance";
    String HISTORY_CACHE_NAME = "history";
    String PACKINGADDRESS_CACHE_NAME = "packingaddress";
    String TOKEN_CACHE_NAME = "tokenStatistics";

    String TOKEN_CACHE_KEY = "token";


    String UTXO_DB_NAME = "utxo";
    String WEBWALLETUTXO_DB_NAME = "webutxodb";
    String WEBWALLETTRANSACTION_DB_NAME = "webtransactiondb";
    String TRANSACTION_DB_NAME = "transaction";
    String BLOCKHEADER_DB_NAME = "blockheader";
    String UTXO_DB_ADDRESS_NAME = "blockAddress";
    String UTXO_DB_ALIAS_NAME = "aliasdb";
    String HISTORY_DB_NAME = "hsitorydb";
    String BALANCE_DB_NAME = "balancedb";
    String PROTOCOL_DB_NAME = "protocoldb";
    byte[] CHANGE_HASH_HEIGHT_KEY = StringUtils.bytes("changeHashHeight");

    String ADDRESS_REWARD_DETAIL = "reward";
    /**
     * 空值占位符
     * Null placeholder.
     */
    byte[] PLACE_HOLDER = new byte[]{(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};

    Na SUM_OF_DEPOSIT_OF_AGENT_LOWER_LIMIT = Na.parseNuls(200000);
    Na SUM_OF_DEPOSIT_OF_AGENT_UPPER_LIMIT = Na.parseNuls(500000);
    Na AGENT_DEPOSIT_LOWER_LIMIT = Na.parseNuls(20000);
    Na AGENT_DEPOSIT_UPPER_LIMIT = Na.parseNuls(200000);
    Na ENTRUSTER_DEPOSIT_LOWER_LIMIT = Na.parseNuls(2000);

    /**
     * 商务合作账户地址
     */
    String BUSINESS_ADDRESS = "businessAddress";

    /**
     * 团队持有账户地址
     */
    String TEAM_ADDRESS = "teamAddress";

    /**
     * 社区基金账户地址
     */
    String COMMUNITY_ADDRESS = "communityAddress";

    /**
     * 映射地址1
     */
    String MAPPING_ADDRESS = "mappingAddress";
}
