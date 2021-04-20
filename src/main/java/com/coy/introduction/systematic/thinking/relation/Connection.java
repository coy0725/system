package com.coy.introduction.systematic.thinking.relation;

import com.coy.introduction.systematic.thinking.behavior.Behavior;
import com.coy.introduction.systematic.thinking.stream.Stream;
import com.coy.introduction.systematic.thinking.structrue.Factor;

/**
 * 连接
 * <p/>系统之思：系统中最不明显的部分就是它的功能或目标，而这常常是系统行为{@link Behavior}最关键的决定因素。
 * 如果内在连接改变了，系统就会发生巨大的变化。拿球队来说，如果球员之间的关系更亲密了，配合程度提高了，即使还是
 * 那些球员，整个球队也会焕然一新。如果改变足球或篮球的比赛规则，我们肯定会看到一种全新的比赛。
 * @author coy
 * @since 2021/4/20
 **/
public interface Connection extends Relation {
    
    default void trasform(Factor t1, Factor t2 , Stream stream){
    
    }
}
