package com.xingkaichun.helloworldblockchain.netcore.dto.netserver.request;

import java.math.BigInteger;

/**
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public class QueryBlockDtoByBlockHeightRequest {

    private BigInteger blockHeight;




    //region get set

    public BigInteger getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(BigInteger blockHeight) {
        this.blockHeight = blockHeight;
    }

    //endregion
}
