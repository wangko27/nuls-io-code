package io.batao.nuls.demo.model;

import io.batao.nuls.demo.BaseNulsData;

import java.util.Set;

/**
 * author Facjas
 * date 2018/5/10.
 */
public abstract class TransactionLogicData extends BaseNulsData {
    public abstract Set<byte[]> getAddresses();
}
