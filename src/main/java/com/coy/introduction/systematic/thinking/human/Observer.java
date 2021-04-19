package com.coy.introduction.systematic.thinking.human;

import com.coy.introduction.systematic.thinking.relation.Constraint;
import com.coy.introduction.systematic.thinking.structrue.ProductSpace;

/**
 * 观察者
 * <p/>真实世界给出了它的子集，乘积空间{@link ProductSpace}代表了观察者的不确定性。
 * 如果换一个观察者，乘积空间可能因此发生改变。两个观察者可能采用不同的乘积空间，
 * 在其中记录真实物体发生的一些真实事件的同一子集。因此，“约束”{@link Constraint}是观察者与事物之间
 * 的一种关系，任何特定事物的特性即取决于事物，又取决于观察者。所以，组织理论的基础部分
 * 和一些属性有关，这些属性不是物体固有的，而是观察者与事物之间的关系。
 *
 * 测不准原理？
 * 观察者所做的就是观察，这些观察可能是生理器官的某种感觉，也可能是测量仪器的读数，还可能是两者的结合。
 * 一次观察可以表述为从一个集合中选择一个元素，该集合包含了这个观察者所有可能的这类观察
 * @author coy
 * @since 2021/4/16
 **/
public interface Observer extends Human{


}
