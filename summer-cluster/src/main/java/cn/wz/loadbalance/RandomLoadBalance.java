package cn.wz.loadbalance;

import cn.wz.rpc.Referer;
import cn.wz.rpc.Request;

/**
 * 随机权重
 */
public class RandomLoadBalance<T> extends AbstractLoadBalance<T> {

    @Override
    public Referer<T> select(Request request) {
        return null;
    }
}
