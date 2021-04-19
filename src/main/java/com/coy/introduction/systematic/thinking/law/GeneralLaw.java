package com.coy.introduction.systematic.thinking.law;

import com.coy.introduction.systematic.thinking.method.InductiveMethod;
import com.coy.introduction.systematic.thinking.system.MiddleNumberSystem;

/**
 * 一般规律
 * 通过发现一般规律，一般系统运动试图帮助我们思考中数系统 {@link MiddleNumberSystem}。
 * 虽然这些规律采用非正式的表述形式，以便促进记忆和最初的理解。
 * @author coy
 * @since 2021/4/17
 **/
public interface GeneralLaw extends Law {
    /**
     * 发现一般系统规律的主要方法是归纳{@link InductiveMethod }
     * 一般系统研究者从不同学科的规律开始，寻找其中的相似性，然后想世界宣布新的“关于规律的规律”。
     * 各学科的一般规律就只是其特例
     * @param inductiveMethod 归纳法
     * @return 一般系统规律
     */
    default GeneralLaw findGeneralLaw(InductiveMethod inductiveMethod){
        return null;
    }
    
    /**
     * 一般系统规律的本质？
     */
    default void getEssence(){
    
    }
}
