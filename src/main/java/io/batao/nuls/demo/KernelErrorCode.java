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
 * 内核模块的所有错误码常量定义
 * @author: Niels Wang
 */
public interface KernelErrorCode {
    /*内核模块的所有错误码常量定义*/
    ErrorCode SUCCESS = ErrorCode.init("10000");
    ErrorCode FAILED = ErrorCode.init("10001");
    ErrorCode SYS_UNKOWN_EXCEPTION = ErrorCode.init("10002");
    ErrorCode DATA_PARSE_ERROR = ErrorCode.init("10003");
    ErrorCode THREAD_REPETITION = ErrorCode.init("10004");
    ErrorCode LANGUAGE_CANNOT_SET_NULL = ErrorCode.init("10005");
    ErrorCode IO_ERROR = ErrorCode.init("10006");
    ErrorCode DATA_SIZE_ERROR = ErrorCode.init("10007");
    ErrorCode CONFIG_ERROR = ErrorCode.init("10008");
    ErrorCode SIGNATURE_ERROR = ErrorCode.init("10009");
    ErrorCode REQUEST_DENIED = ErrorCode.init("10010");
    ErrorCode DATA_SIZE_ERROR_EXTEND = ErrorCode.init("10011");
    ErrorCode PARAMETER_ERROR = ErrorCode.init("10012");
    ErrorCode NULL_PARAMETER = ErrorCode.init("10013");
    ErrorCode DATA_ERROR = ErrorCode.init("10014");
    ErrorCode DATA_NOT_FOUND = ErrorCode.init("10015");
    ErrorCode DOWNLOAD_VERSION_FAILD = ErrorCode.init("10016");
    ErrorCode PARSE_JSON_FAILD = ErrorCode.init("10017");
    ErrorCode FILE_OPERATION_FAILD = ErrorCode.init("10018");
    ErrorCode ILLEGAL_ACCESS_EXCEPTION = ErrorCode.init("10019");
    ErrorCode INSTANTIATION_EXCEPTION = ErrorCode.init("10020");
    ErrorCode UPGRADING = ErrorCode.init("10021");
    ErrorCode NOT_UPGRADING = ErrorCode.init("10022");
    ErrorCode VERSION_NOT_NEWEST = ErrorCode.init("10023");
    ErrorCode SERIALIZE_ERROR = ErrorCode.init("10024");
    ErrorCode DESERIALIZE_ERROR = ErrorCode.init("10025");
    ErrorCode HASH_ERROR = ErrorCode.init("10026");
    ErrorCode INSUFFICIENT_BALANCE = ErrorCode.init("10027");
    ErrorCode ADDRESS_IS_BLOCK_HOLE= ErrorCode.init("10028");
    ErrorCode ADDRESS_IS_NOT_BELONGS_TO_CHAIN= ErrorCode.init("10029");
    ErrorCode VALIDATORS_NOT_FULLY_EXECUTED= ErrorCode.init("10030");
    ErrorCode BLOCK_IS_NULL= ErrorCode.init("10031");

    /*AccountErrorCode*/
    ErrorCode PASSWORD_IS_WRONG = ErrorCode.init("50000");
    ErrorCode ACCOUNT_NOT_EXIST = ErrorCode.init("50001");
    ErrorCode ACCOUNT_IS_ALREADY_ENCRYPTED = ErrorCode.init("50002");
    ErrorCode ACCOUNT_EXIST = ErrorCode.init("50003");
    ErrorCode ADDRESS_ERROR = ErrorCode.init("50004");
    ErrorCode ALIAS_EXIST = ErrorCode.init("50005");
    ErrorCode ALIAS_NOT_EXIST = ErrorCode.init("50006");
    ErrorCode ACCOUNT_ALREADY_SET_ALIAS = ErrorCode.init("50007");
    ErrorCode ACCOUNT_UNENCRYPTED = ErrorCode.init("50008");
    ErrorCode ALIAS_CONFLICT = ErrorCode.init("50009");
    ErrorCode HAVE_ENCRYPTED_ACCOUNT = ErrorCode.init("50010");
    ErrorCode HAVE_UNENCRYPTED_ACCOUNT = ErrorCode.init("50011");
    ErrorCode PRIVATE_KEY_WRONG = ErrorCode.init("50012");
    ErrorCode ALIAS_ROLLBACK_ERROR = ErrorCode.init("50013");
    ErrorCode ACCOUNTKEYSTORE_FILE_NOT_EXIST = ErrorCode.init("50014");
    ErrorCode ACCOUNTKEYSTORE_FILE_DAMAGED = ErrorCode.init("50015");
    ErrorCode ALIAS_FORMAT_WRONG = ErrorCode.init("50016");
    ErrorCode PASSWORD_FORMAT_WRONG = ErrorCode.init("50017");
    ErrorCode DECRYPT_ACCOUNT_ERROR = ErrorCode.init("50018");
    ErrorCode ACCOUNT_IS_ALREADY_ENCRYPTED_AND_LOCKED = ErrorCode.init("50019");
    ErrorCode NICKNAME_TOO_LONG = ErrorCode.init("50020");

    /*ContractErrorCode*/
    ErrorCode CONTRACT_EXECUTE_ERROR = ErrorCode.init("100001");
    ErrorCode CONTRACT_ADDRESS_NOT_EXIST = ErrorCode.init("100002");
    ErrorCode CONTRACT_TX_CREATE_ERROR = ErrorCode.init("100003");
    ErrorCode ILLEGAL_CONTRACT_ADDRESS = ErrorCode.init("100004");
    ErrorCode NON_CONTRACTUAL_TRANSACTION = ErrorCode.init("100005");
    ErrorCode NON_CONTRACTUAL_TRANSACTION_NO_TRANSFER = ErrorCode.init("100006");
    ErrorCode CONTRACT_NAME_FORMAT_INCORRECT = ErrorCode.init("100007");
    ErrorCode CONTRACT_NOT_NRC20 = ErrorCode.init("100008");
    ErrorCode CONTRACT_NON_VIEW_METHOD = ErrorCode.init("100009");
    ErrorCode ILLEGAL_CONTRACT = ErrorCode.init("100010");
    ErrorCode CONTRACT_DUPLICATE_TOKEN_NAME = ErrorCode.init("100011");
    ErrorCode CONTRACT_NRC20_SYMBOL_FORMAT_INCORRECT = ErrorCode.init("100012");
    ErrorCode CONTRACT_LOCK = ErrorCode.init("100013");

    /*DBErrorCode*/
    ErrorCode DB_MODULE_START_FAIL = ErrorCode.init("20000");
    ErrorCode DB_UNKOWN_EXCEPTION = ErrorCode.init("20001");
    ErrorCode DB_SESSION_MISS_INIT = ErrorCode.init("20002");
    ErrorCode DB_SAVE_CANNOT_NULL = ErrorCode.init("20003");
    ErrorCode DB_SAVE_BATCH_LIMIT_OVER = ErrorCode.init("20004");
    ErrorCode DB_DATA_ERROR = ErrorCode.init("20005");
    ErrorCode DB_SAVE_ERROR = ErrorCode.init("20006");
    ErrorCode DB_UPDATE_ERROR = ErrorCode.init("20007");
    ErrorCode DB_ROLLBACK_ERROR = ErrorCode.init("20008");
    ErrorCode DB_AREA_EXIST = ErrorCode.init("20009");
    ErrorCode DB_AREA_NOT_EXIST = ErrorCode.init("20010");
    ErrorCode DB_AREA_CREATE_EXCEED_LIMIT = ErrorCode.init("20011");
    ErrorCode DB_AREA_CREATE_ERROR = ErrorCode.init("20012");
    ErrorCode DB_AREA_CREATE_PATH_ERROR = ErrorCode.init("20013");
    ErrorCode DB_AREA_DESTROY_ERROR = ErrorCode.init("20014");
    ErrorCode DB_BATCH_CLOSE = ErrorCode.init("20015");

    /*LedgerErrorCode*/
    ErrorCode LEDGER_P2PKH_SCRIPT_ERROR = ErrorCode.init("80001");

    /*MessageBusErrorCode*/
    ErrorCode UNKOWN_MSG_TYPE= ErrorCode.init("60001");

    /*NetworkErrorCode*/
    ErrorCode NET_SERVER_START_ERROR = ErrorCode.init("40001");
    ErrorCode NET_MESSAGE_ERROR = ErrorCode.init("40002");
    ErrorCode NET_MESSAGE_XOR_ERROR = ErrorCode.init("40003");
    ErrorCode NET_MESSAGE_LENGTH_ERROR = ErrorCode.init("40004");
    ErrorCode NET_NODE_GROUP_ALREADY_EXISTS = ErrorCode.init("40006");
    ErrorCode NET_NODE_AREA_ALREADY_EXISTS = ErrorCode.init("40007");
    ErrorCode NET_NODE_GROUP_NOT_FOUND = ErrorCode.init("40008");
    ErrorCode NET_NODE_AREA_NOT_FOUND = ErrorCode.init("40009");
    ErrorCode NET_NODE_NOT_FOUND = ErrorCode.init("40010");
    ErrorCode NET_BROADCAST_FAIL = ErrorCode.init("40011");
    ErrorCode NET_BROADCAST_NODE_EMPTY = ErrorCode.init("40012");
    ErrorCode NET_NODE_DEAD = ErrorCode.init("40013");
    ErrorCode NET_NODE_MISS_CHANNEL = ErrorCode.init("40014");

    /*PocConsensusErrorCode*/
    ErrorCode TIME_OUT = ErrorCode.init("70001");
    ErrorCode DEPOSIT_ERROR = ErrorCode.init("70002");
    ErrorCode DEPOSIT_NOT_ENOUGH = ErrorCode.init("70003");
    ErrorCode CONSENSUS_EXCEPTION = ErrorCode.init("70004");
    ErrorCode COMMISSION_RATE_OUT_OF_RANGE = ErrorCode.init("70005");
    ErrorCode LACK_OF_CREDIT = ErrorCode.init("70006");
    ErrorCode DEPOSIT_OVER_COUNT = ErrorCode.init("70007");
    ErrorCode DEPOSIT_TOO_MUCH = ErrorCode.init("70008");
    ErrorCode AGENT_STOPPED = ErrorCode.init("70009");
    ErrorCode DEPOSIT_WAS_CANCELED = ErrorCode.init("70010");
    ErrorCode DEPOSIT_NEVER_CANCELED = ErrorCode.init("70011");
    ErrorCode UPDATE_DEPOSIT_FAILED = ErrorCode.init("70012");
    ErrorCode UPDATE_AGENT_FAILED = ErrorCode.init("70014");
    ErrorCode LOCK_TIME_NOT_REACHED = ErrorCode.init("70015");
    ErrorCode AGENT_NOT_EXIST = ErrorCode.init("70016");
    ErrorCode AGENT_EXIST = ErrorCode.init("70017");
    ErrorCode AGENT_PUNISHED = ErrorCode.init("70018");
    ErrorCode BIFURCATION = ErrorCode.init("70019");
    ErrorCode YELLOW_PUNISH_TX_WRONG = ErrorCode.init("70020");
    ErrorCode ADDRESS_IS_CONSENSUS_SEED = ErrorCode.init("70021");
    ErrorCode TRANSACTIONS_NEVER_DOUBLE_SPEND = ErrorCode.init("70022");
    ErrorCode WRONG_RED_PUNISH_REASON = ErrorCode.init("70023");
    ErrorCode AGENT_PACKING_EXIST = ErrorCode.init("70024");
    ErrorCode AGENTADDR_AND_PACKING_SAME = ErrorCode.init("70025");
    ErrorCode REWARDADDR_PACKING_SAME = ErrorCode.init("70026");

    /*ProtocolErroeCode*/
    ErrorCode BLOCK_HEADER_SIGN_CHECK_FAILED= ErrorCode.init("30001");
    ErrorCode BLOCK_HEADER_FIELD_CHECK_FAILED= ErrorCode.init("30002");
    ErrorCode BLOCK_FIELD_CHECK_FAILED= ErrorCode.init("30003");
    ErrorCode BLOCK_TOO_BIG= ErrorCode.init("30004");
    ErrorCode MERKLE_HASH_WRONG= ErrorCode.init("30005");

    /*TransactionErrorCode*/
    ErrorCode UTXO_UNUSABLE = ErrorCode.init("31001");
    ErrorCode UTXO_STATUS_CHANGE = ErrorCode.init("31002");
    ErrorCode INVALID_INPUT = ErrorCode.init("31004");
    ErrorCode INVALID_AMOUNT = ErrorCode.init("31005");
    ErrorCode ORPHAN_TX = ErrorCode.init("31006");
    ErrorCode ORPHAN_BLOCK = ErrorCode.init("31007");
    ErrorCode TX_DATA_VALIDATION_ERROR = ErrorCode.init("31008");
    ErrorCode FEE_NOT_RIGHT = ErrorCode.init("31009");
    ErrorCode ROLLBACK_TRANSACTION_FAILED = ErrorCode.init("31010");
    ErrorCode TRANSACTION_REPEATED = ErrorCode.init("31011");
    ErrorCode TOO_SMALL_AMOUNT = ErrorCode.init("31012");
    ErrorCode TX_SIZE_TOO_BIG = ErrorCode.init("31013");
    ErrorCode SAVE_TX_ERROR = ErrorCode.init("31014");
    ErrorCode TX_NOT_EXIST = ErrorCode.init("31015");
    ErrorCode COINDATA_NOT_FOUND = ErrorCode.init("31016");
    ErrorCode TX_TYPE_ERROR = ErrorCode.init("31017");

    /*API-SERVER ErrorCode*/
    //交易类型不存在
    ErrorCode TX_TYPE_NULL = ErrorCode.init("91001");
    //转账金额不正确 小于等于0
    ErrorCode TX_MONEY_NULL = ErrorCode.init("91002");
    //转账手续费不正确
    ErrorCode TX_PRICE_NULL = ErrorCode.init("91003");
    //收款地址不正确
    ErrorCode TX_TOADDRESS_NULL = ErrorCode.init("91004");
    //保存交易后的utxo错误 保存交易失败
    ErrorCode TX_SAVETEMPUTXO_ERROR = ErrorCode.init("91005");
    //广播失败
    ErrorCode TX_BROADCAST_ERROR = ErrorCode.init("91007");
    //备注不能包含特殊字符
    ErrorCode TX_REMARK_ERROR = ErrorCode.init("94008");
    //别名格式不正确
    ErrorCode TX_ALIAS_ERROR = ErrorCode.init("94009");
    //别名已占用
    ErrorCode TX_ALIAS_USED_ERROR = ErrorCode.init("94010");
    //该地址已经设置过别名
    ErrorCode TX_ALIAS_SETED_ERROR = ErrorCode.init("94011");
    //退出中
    ErrorCode TX_ALIAS_CANCEL_DEPOSIT_ERROR = ErrorCode.init("94013");
    //备注太长
    ErrorCode TX_REMARK_LENTH_ERROR = ErrorCode.init("94014");
    //交易已确认
    ErrorCode TX_HASH_CONFIRMED_ERROR = ErrorCode.init("94015");
    //余额不足
    ErrorCode BALANCE_NOT_ENOUGH = ErrorCode.init("95001");
    //零钱太多
    ErrorCode BALANCE_TOO_MUCH = ErrorCode.init("95002");
    //正在同步高度，暂时无法交易
    ErrorCode BLOCK_NOT_SYNC = ErrorCode.init("95003");

}
