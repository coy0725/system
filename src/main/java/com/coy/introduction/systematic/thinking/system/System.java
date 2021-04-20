package com.coy.introduction.systematic.thinking.system;

import com.coy.introduction.systematic.thinking.goal.Goal;
import com.coy.introduction.systematic.thinking.goal.SystemGoal;
import com.coy.introduction.systematic.thinking.human.Observer;
import com.coy.introduction.systematic.thinking.primitive.Primitive;
import com.coy.introduction.systematic.thinking.relation.Connection;
import com.coy.introduction.systematic.thinking.relation.Relation;
import com.coy.introduction.systematic.thinking.structrue.Factor;

import java.util.List;

/**
 * 有序的复杂
 * <p/>有序：不适合统计
 * <p/>复杂：不适合精确计算
 * 一个系统就是对世界的一种看法，这对诗人来说很自然，却吓坏了科学家，如此说来系统就是在玩游戏，
 * 而不是获得知识。知识就是“真理”，就是“事实”。如果两个科学家用不同的“系统”来观察同一个事物，
 * 科学就不比诗歌好多少，一个人会看到潇洒而文明，另一个人看到邋遢的衣服
 * 重要的不是我们看到了什么，而是我们如何感受看到的东西
 * 独立于观察者{@link Observer}的真理才是最大的自我中心论，如果真的存在这样的真理，那么谁能发现呢？
 *
 * <p/>对于人造系统，我们可以谈论其“目的”；而取决于“自然系统”，则绝对不能如此，人们对人造系统的不满，
 * 多数源于不认同这些系统的设计“目的”，系统没有‘目的’，因为目的是一种关系不是能有的东西。
 *
 * <p/>系统就是物体的集合，包括这些物体及其属性之间的关系{@link Relation}--霍尔、费根
 * 这些物体从何而来？却没有给出任何线索，关系是系统概念的重要部分，但对于系统本身与观察者的观点却没有给出丝毫暗示。
 *
 * <p/>系统集合的成员是系统思维中未定义的原语{@link Primitive}之一,如果我们能说他们是什么，我们谈论的不再是一般系统{@link GeneralSystem}
 * 而是特定系统
 *
 * <p/>系统并不仅仅是一些事物的简单集合，而是由一组相互连接的要素构成的、能够实现某个目标的整体。从这一定义出发，
 * 任何一个系统都包括三种构成要件：要素、连接、功能或目标
 * 对于系统来说，如果你更换了其中的要素，系统就被改变了。例如引进或开除某一个球员。当一个生物死去，使其成为一个有机系统
 * 的多种连接{@link Connection}不再产生作用时，它就丧失了作为一个系统的存在状态，尽管它仍是一个更大食物链系统中的组成部分。
 *
 * @see SystemGoal
 * @author coy
 * @since 2021/4/16
 **/
public interface System {
    /**
     * 如何让系统转向符合人们预期的行为模式
     */
    default void perform(){
    
    }
    
    /**
     * 得到构成系统中的要素
     * @return 系统中的要素
     */
    default List<Factor> getFactors(){
        return null;
    }
    
    /**
     * 得到系统中的连接
     * @return 连接
     */
    default List<Connection> getConnections(){
        return null;
    }
    
    /**
     * 返回系统的功能或目标
     * @return 目标或功能
     */
    default List<Goal> getGoals(){
        return null;
    }
}
