package com.coy.introduction.systematic.thinking.human;

import com.coy.introduction.systematic.thinking.pattern.ThinkPattern;
import com.coy.introduction.systematic.thinking.element.Component;
import com.coy.introduction.systematic.thinking.element.Machine;

import java.util.List;

/**
 * 工程师
 * @author coy
 * @since 2021/4/16
 **/
public class Engineer implements Human {
    
    /**
     * 将少数零件组合成大机器，其主要原则是避免零件之间产生过多的互动
     * @param components 零部件
     * @return Machine 机器
     */
    Machine assemble(List<Component> components){
        return new Machine();
    }
    
    @Override
    public ThinkPattern getThinkPattern() {
        return null;
    }
}
