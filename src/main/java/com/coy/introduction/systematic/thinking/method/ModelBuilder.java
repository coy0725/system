package com.coy.introduction.systematic.thinking.method;

import com.coy.introduction.systematic.thinking.features.model.Abstraction;
import com.coy.introduction.systematic.thinking.model.EpidemicModel;
import com.coy.introduction.systematic.thinking.model.Model;
import com.coy.introduction.systematic.thinking.system.System;
/**
 * @author coy
 * @since 2021/4/21
 **/
public interface ModelBuilder extends Method{
    
    /**
     * 构建模型的第一种方法是具身法。用这种方法构建的模型包括重要部分，同时对于不必要的维度和属性，要么剥离，要么将他们整合到一起考虑。
     * 生态沼泽模型，立法机构和交通系统都是用这种方法构建的，气候模型和大脑模型也是如此
     * @return Model
     */
    Model embodiment();
    
    /**
     * 构建模型的第二种方法是类比法，可以对现实进行类比和抽象{@link Abstraction},我们可以将犯罪行为类比为传染病传播{@link EpidemicModel}
     * 将政治离场的选择类比为在一个左右连续线段上的选择。相比而言，具身法更强调现实主义，而类比法则致力于刻画过程、系统{@link System}
     * @return Model
     */
    Model analogy();
    
    /**
     * 另类现实法，也就是有意不去表征、刻画现实。{@link }
     * @return
     */
    Model alternaltiveReality();
}
