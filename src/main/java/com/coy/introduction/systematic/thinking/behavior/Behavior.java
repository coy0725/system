package com.coy.introduction.systematic.thinking.behavior;

import java.util.List;

/**
 * 行为
 * @author coy
 * @since 2021/4/16
 **/
public interface Behavior {
    /**
     * @return 行为线集合
     */
    default List<BehaviorLine> getBehaviorLines(){
        return null;
    }
}
