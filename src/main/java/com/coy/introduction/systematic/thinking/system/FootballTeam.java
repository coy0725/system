package com.coy.introduction.systematic.thinking.system;

import com.coy.introduction.systematic.thinking.goal.Goal;
import com.coy.introduction.systematic.thinking.relation.Connection;
import com.coy.introduction.systematic.thinking.structrue.Factor;

import java.util.List;

/**
 * 足球队是一个系统
 * 他的要素是什么？
 * 连接是什么？
 * 目标或者功能是什么？
 * @author coy
 * @since 2021/4/20
 **/
public class FootballTeam implements System {
    /**
     * 球员、教练、场地、足球
     */
    private List<Factor> factors;
    
    /**
     * 他们之间通过游戏规则、教练指导、球员技能、球员之间的交流以及物理法则产生连接
     */
    private List<Connection> connections;
    
    /**
     * 球队的目标是赢球、娱乐或赚钱
     */
    private List<Goal> goals;
}
