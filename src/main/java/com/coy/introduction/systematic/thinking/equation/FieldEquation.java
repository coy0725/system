package com.coy.introduction.systematic.thinking.equation;

import com.coy.introduction.systematic.thinking.behavior.Behavior;
import com.coy.introduction.systematic.thinking.behavior.FieldBehavior;

/**
 * 物体都不存在时系统的行为
 * @author coy
 * @since 2021/4/16
 **/
public class FieldEquation implements Equation {
    
    @Override
    public Behavior getBehavior() {
        return (FieldBehavior) () -> null;
    }
}
