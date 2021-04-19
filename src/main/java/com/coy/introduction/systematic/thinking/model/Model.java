package com.coy.introduction.systematic.thinking.model;

import com.coy.introduction.systematic.thinking.primitive.Primitive;
import com.coy.introduction.systematic.thinking.subject.Science;

/**
 * 模型
 * 任何模型，都是用我们已经了解的一种东西，去表示我们认为想要了解的另一种东西。
 * 推理的过程可能有上百步逻辑，也可能只是一个类比，但最终总是会得到我们认为无需继续深究的一些原语{@link Primitive}。
 * 科学{@link Science}要具有解释“能力”，这些原语不能太大也不能太小。
 * 模型的主要作用与其说是解释和预测，不如说是让思维集中提出尖锐的问题。
 * <p/>与模型相关的三种活动
 * <li>促进思维过程
 * <li>研究特殊系统
 * <li>创造新定律和改进旧定律
 * @author coy
 * @since 2021/4/17
 **/
public interface Model {
    
    /**
     * 解释
     */
    default void explain(){
    
    }
    
    /**
     * 预测
     */
    default void predict(){
    
    };
}
