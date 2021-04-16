package com.coy.introduction.systematic.thinking.law;

import com.coy.introduction.systematic.thinking.system.StatisticalMechanicsSystem;

/**
 * 大数定律
 * 统计样本的数量越多，观测值越接近于预测的平均值
 * {@link StatisticalMechanicsSystem} 统计力学
 * @author coy
 * @since 2021/4/16
 **/
public class LargeNumbersLaw implements Law {
    
    /**
     *
     * @param sampleSize 样本数量
     * @return 观测值与预测的平均值的误差
     */
    Double observe(Long sampleSize){
        return 1/Math.sqrt(sampleSize);
    }
    
}
