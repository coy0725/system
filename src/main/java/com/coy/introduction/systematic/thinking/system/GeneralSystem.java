package com.coy.introduction.systematic.thinking.system;

import com.coy.introduction.systematic.thinking.equation.FieldEquation;
import com.coy.introduction.systematic.thinking.equation.InteractionEquation;
import com.coy.introduction.systematic.thinking.equation.IsolatedEquation;

import java.util.List;

/**
 * 一般系统，系统中的物体数是n
 * <p/>描述每个物体自身的行为需要n个,{@link IsolatedEquation}孤立方程
 * <p/>描述物体间相互作用需要2的n次方个,{@link InteractionEquation}相互作用方程
 * <p/>描述物体都不存在是系统的行为，需要一个,{@link FieldEquation}场方程
 * @author coy
 * @since 2021/4/16
 **/
public class GeneralSystem implements System{
    
    /**
     * 系统中的物体
     */
    private List<Object> objects;
    /**
     * 场方程一个
     */
    private FieldEquation fieldEquation;
    
    /**
     * n个物体需要n个孤立方程
     */
    private List<IsolatedEquation> isolatedEquations;
    /**
     * n个物体需要2的n次方个相互作用方程
     */
    private  List<InteractionEquation> interactionEquations;
}
