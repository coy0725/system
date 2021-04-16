package com.coy.introduction.systematic.thinking.law;

import com.coy.introduction.systematic.thinking.system.GeneralSystem;

/**
 * 计算的平方律
 * <p/>随着问题规模的增长，除非能够进行某种简化，否则计算量的增长至少是方程数增长的平方
 * <p/>而描述系统的方程数随着系统中物体个数的增长是指数型的
 * <p/>计算的平方律决定了任何计算设备都有计算能力的极限
 * {@link GeneralSystem}
 * @author coy
 * @since 2021/4/16
 **/
public class ComputationSquareLaw implements Law {
    
    /**
     *
     * @param problemSize 问题规模
     * @return 计算量n*n
     */
    public long caculate(long problemSize){
        return problemSize*problemSize;
    }
}
