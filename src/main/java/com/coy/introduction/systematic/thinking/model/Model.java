package com.coy.introduction.systematic.thinking.model;

import com.coy.introduction.systematic.thinking.equation.Equation;
import com.coy.introduction.systematic.thinking.features.Feature;
import com.coy.introduction.systematic.thinking.goal.Function;
import com.coy.introduction.systematic.thinking.human.GeneralSystemScholar;
import com.coy.introduction.systematic.thinking.law.Law;
import com.coy.introduction.systematic.thinking.method.ModelBuilder;
import com.coy.introduction.systematic.thinking.phenomenon.Phenomenon;
import com.coy.introduction.systematic.thinking.primitive.Primitive;
import com.coy.introduction.systematic.thinking.element.Factor;
import com.coy.introduction.systematic.thinking.relation.Relation;
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
 *
 * <p/> 从模型中得出的结论总是采用条件判断形式：如果条件a成立，那么可以得出结果b.例如你要装箱，而大小是唯一的约束条件，那么就先装最大
 * 最好的东西。我们从经典文献和伟大思想家的名言中吸取的教训却通常不包括任何条件。如果我们试图依据这种“原则”来生活或管理他人，就肯定会迷失
 * 在众多意思相反的谚语海洋汇总
 * <li/> 三个臭皮匠，赛过诸葛亮--厨子多了少烧坏汤
 * <li/>破釜沉舟--留得青山在不愁没柴烧
 * 现在的学生很难理解牛顿关于行星轨道的计算为什么能跻身人类最伟大的成就之列，但是一般系统思想家{@link GeneralSystemScholar}能够理解
 * 因为他们所选择的任务就是理解科学的简化假设。用维格纳的话说就是：这些感兴趣的对象和明确定义的条件 限定了科学的应用范围，增强了他的预测能力
 * 相反的谚语经常共存，但是相反的定理{@link Law}却不会出现
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
     * 为经验现象{@link Phenomenon}提供可检验解释
     * <li/>物理学模型可以解释坠落物体的轨迹和轨迹形状的变化
     * <li/>生物学模型可以解释物种的分布
     * 模型可以解释任何东西，然而基于模型的解释必须包括正式的假设和明确的因果链条，而且这些假设和因果链条都要面对数据。
     */
    default void explain(){
    
    }
    /**
     * 设计
     * 选择制度、政策和规则的特征
     * 模型可以通过提供框架来帮助设计，因为只有在适当的框架内我们才可以考虑不同选择的含义。
     * <li/>工程师使用模型设计供应链
     * <li/>计算机科学家使用模型设计web协议
     * <li/>社会科学家使用模型设计制度
     */
    default void design(){
    
    }
    
    /**
     * 沟通
     * 将知识与理解联系起来
     * <p/> 由于创造了一种共同的表示方法，模型能够有效地改进交流。模型要求对相关特征{@link Feature},及其关系{@link Relation}给出
     * 正确定义，这使我能够精确地进行交流。例如，模型F=ma，涉及3个可测量的量--力、质量和加速度，并将他们之间的关系用方程式出来。每一项
     * 都可以表示为可测量的单位，因而可以很方便地就这个模型进行交流，而不必担心有什么误解。相比之下，更大、更快的东西会产生更大的力，
     * 这种说法的准确度却要低得多，因为这需要解释，而翻译会会令很多人迷失方向，更大指的是质量还是体积？更快指的是速度还是加速度
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
