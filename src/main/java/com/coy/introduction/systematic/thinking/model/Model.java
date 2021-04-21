package com.coy.introduction.systematic.thinking.model;

import com.coy.introduction.systematic.thinking.equation.Equation;
import com.coy.introduction.systematic.thinking.goal.Function;
import com.coy.introduction.systematic.thinking.method.ModelBuilder;
import com.coy.introduction.systematic.thinking.primitive.Primitive;
import com.coy.introduction.systematic.thinking.element.Factor;
import com.coy.introduction.systematic.thinking.subject.Science;
import com.coy.introduction.systematic.thinking.system.System;

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
 *
 * <p/> 《模型思维》
 * 模型是一种结构，以数学公式和图表的的形式进行展现，能够帮助我们理解世界。掌握各种模型可以提高我们推理、解释、设计、沟通
 * 行动、预测、行动和探索的能力，所有的模型都有一个共同的形式：他们都假设一些实体()也就是系统中的要素{@link Factor}，通常是人或组织，
 * 并描述他们是如何相互作用的{@link Equation}
 * 本书讨论的模型分为三类，对世界进行简化的模型{@link SimplyWorldModel}，用数学概率来类比的模型{@link MathematicalProbabilityModel}
 * 以及人工构造的探索性模型{@link ManualExplorationModel}
 * 无论哪一种形式，模型必须是易处理的。模型必须足够简单，以便我们可以在模型中应用逻辑推理。例如{@link EpidemicModel}
 * 尽管单个模型本身可能就已经相当强大了，但是一组模型可以实现更多的的功能{@link Function}。在拥有多个模型的情况下，我们可以避免每个模型
 * 所固有的局限性。多模型方法可以消除每个模型的盲点。{@link System} 一个模型也就是一种观点。
 * --
 * 如何构建模型？{@link ModelBuilder}
 * @author coy
 * @since 2021/4/17
 **/
public interface Model {
    /**
     * 推理
     * 识别条件并推断逻辑含义
     */
    default void reason(){
    
    };
    /**
     * 解释
     * 为经验现象提供可检验解释
     */
    default void explain(){
    
    }
    /**
     * 设计
     * 选择制度、政策和规则的特征
     */
    default void design(){
    
    }
    
    /**
     * 沟通
     * 将知识与理解联系起来
     */
    default void communicate(){
    
    }
    /**
     * 行动
     * 指导政策选择和战略行动
     */
    default void act(){
    
    }
    /**
     * 预测
     * 对未来和未知现象进行数值和分类预测
     */
    default void predict(){
    }
    
    /**
     * 探索
     * 分析探索可能性和假说
     */
    default void explore(){
    
    }




    
}
