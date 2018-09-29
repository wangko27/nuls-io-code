package io.batao.nuls.demo;

/**
 * Description: 实体类里面的状态字段表示的值
 * Author: moon
 * Date:  2018/5/31 0031
 */
public class EntityConstant {
    /**
     * 等待共识
     */
    public static final int CONSENSUS_STATUS_WAIT = 0;
    /**
     * 共识中
     */
    public static final int CONSENSUS_STATUS_CONSENSUSING = 1;

    /**
     * 共识奖励
     */
    public static final int TX_TYPE_COINBASE = 1;
    /**
     * 转账交易
     */
    public static final int TX_TYPE_TRANSFER = 2;
    /**
     * 设置别名交易
     */
    public static final int TX_TYPE_ACCOUNT_ALIAS = 3;
    /**
     * 创建共识节点交易
     */
    public static final int TX_TYPE_REGISTER_AGENT = 4;
    /**
     * 加入共识交易
     */
    public static final int TX_TYPE_JOIN_CONSENSUS = 5;
    /**
     * 退出共识交易
     */
    public static final int TX_TYPE_CANCEL_DEPOSIT = 6;
    /**
     * 删除共识节点交易
     */
    public static final int TX_TYPE_STOP_AGENT = 9;
    /**
     * 黄牌交易
     */
    public static final int TX_TYPE_YELLOW_PUNISH = 7;
    /**
     * 红牌交易
     */
    public static final int TX_TYPE_RED_PUNISH = 8;
    /**
     * 黄牌惩罚
     */
    public static final int PUBLISH_YELLOW = 1;
    /**
     * 红牌惩罚
     */
    public static final int PUTLISH_RED = 2;


    /**
     * CONTRACT 创建合约
     */
    public static int TX_TYPE_CREATE_CONTRACT = 100;
    /**
     * 调用合约
     */
    public static int TX_TYPE_CALL_CONTRACT = 101;
    /**
     * 删除合约
     */
    public static int TX_TYPE_DELETE_CONTRACT = 102;

    /**
     * contract transfer 合约转账
     */
    public static int TX_TYPE_CONTRACT_TRANSFER = 103;


    /**
     * 设置别名费用
     */
    public static final Na ALIAS_NA = Na.parseNuls(1);

    /**
     * 搜索 交易hash
     */
    public static int SEARCH_TX_HASH = 1;
    /**
     * 搜索 账户地址
     */
    public static int SEARCH_ACCOUNT_ADDRESS = 2;
    /**
     * 搜索 区块hash
     */
    public static int SEARCH_HEADER_HASH = 3;
    /**
     * 搜索 高度
     */
    public static int SEARCH_HEADER_HEIGHT = 4;
    /**
     * 网页钱包交易状态 未确认
     */
    public static int WEBWALLET_STATUS_NOTCONFIRM = 1;
    /**
     * 网页钱包交易状态 已确认
     */
    public static int WEBWALLET_STATUS_CONFIRM = 2;

    public static int TRANSFEE_NOTENOUGHT_OK = 1;
    public static int TRANSFEE_NOTENOUGHT_UTXO = 2;
    public static int TRANSFEE_NOTENOUGHT_MONEY = 3;

}
