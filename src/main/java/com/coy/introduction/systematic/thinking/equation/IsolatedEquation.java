package com.coy.introduction.systematic.thinking.equation;

import com.coy.introduction.systematic.thinking.behavior.Behavior;
import com.coy.introduction.systematic.thinking.behavior.IsolatedBehavior;

/**
 * 孤立方程
 * @author coy
 * @since 2021/4/16
 **/
public class IsolatedEquation implements Equation {
    private IsolatedBehavior isolatedBehavior;
    
    @Override
    public Behavior getBehavior() {
        return null;
    }
}
