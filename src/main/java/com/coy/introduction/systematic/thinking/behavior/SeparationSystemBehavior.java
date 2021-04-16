package com.coy.introduction.systematic.thinking.behavior;

import java.util.List;

/**
 * 分解系统的行为
 * @author coy
 * @since 2021/4/16
 **/
public class SeparationSystemBehavior implements Behavior{
    @Override
    public List<BehaviorLine> getBehaviorLines() {
        return null;
    }
    
    /**
     * <p/>将一个系统分解成若干个没有相互作用的子系统
     * <p/>求解含n个方程的系统需要n的平方次计算
     * <p/>计算n个含一个方程的独立系统需要进行n次计算
     * @param system 复杂系统
     * @return 若干个没有相互作用的子系统
     */
    List<System> separateSystem(System system){
        return null;
    }
}
