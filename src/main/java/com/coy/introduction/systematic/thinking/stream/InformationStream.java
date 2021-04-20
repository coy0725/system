package com.coy.introduction.systematic.thinking.stream;

import com.coy.introduction.systematic.thinking.behavior.Behavior;
import com.coy.introduction.systematic.thinking.goal.Goal;
import com.coy.introduction.systematic.thinking.relation.Connection;

/**
 * 信息流
 * 还有很多连接{@link Connection}是信息流，也就是在系统中影响决策和行动的各种信号。这类连接通常很难被发现
 * 例如消费者会参考其收入、储蓄、贷款额度、商品价格等信息来做出是否购买的决策
 * 如果说基于信息的连接都很难被发现，那么与系统功能或目标{@link Goal}有关的连接就更难被察觉了，只有通过分析
 * 系统运作，我们才有可能明确的表述出系统的功能或目标。要想推断出系统的目标，最好的方法就是仔细地观察一段时间
 * 看看{@link System}有哪些行为{@link Behavior}
 * @author coy
 * @since 2021/4/20
 **/
public interface InformationStream extends Stream {
}
