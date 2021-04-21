package com.coy.introduction.systematic.thinking.system;

import com.coy.introduction.systematic.thinking.relation.Connection;
import com.coy.introduction.systematic.thinking.signal.Sigal;
import com.coy.introduction.systematic.thinking.element.Factor;

import java.util.List;

/**
 * 在树木系统中，内在的连接{@link Connection}是那些影响着树木新陈代谢过程的物质流动和化学反应
 * 也就是让系统中某一部分对另外一部分做出反应的各种信号{@link Sigal}
 * 例如，晴天时，当树叶散失了水分，负责输送水分的叶脉中的压力就会减少，从而从树根那里汲取更多的
 * 水分，相反，如果树根察觉到土壤变得干燥、水分减少，叶脉中压力减少的信号就会让树叶关闭气孔，以避免
 * 流失更多的水分。
 *
 * 系统之思
 * 系统中很多连接{@link Connection}是通过信息流进行运作的，信息使系统整合在一起，并对系统的运作产生影响
 * @author coy
 * @since 2021/4/20
 **/
public class Tree implements System {
    
    
    @Override
    public List<Factor> getFactors() {
        return null;
    }
}
