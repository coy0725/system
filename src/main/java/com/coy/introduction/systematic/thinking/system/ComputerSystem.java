package com.coy.introduction.systematic.thinking.system;

import com.coy.introduction.systematic.thinking.element.Factor;
import com.coy.introduction.systematic.thinking.element.Hardware;
import com.coy.introduction.systematic.thinking.element.Software;
import com.coy.introduction.systematic.thinking.element.SystemSoftware;
import com.coy.introduction.systematic.thinking.goal.Goal;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算机系统
 * @author coy
 * @since 2021/4/23
 **/
public class ComputerSystem implements System {
    /**
     * 计算机系统是由硬件{@link Hardware}和系统软件{@link SystemSoftware}
     * @return
     */
    @Override
    public List<Factor> getFactors() {
        List<Factor> factors=new ArrayList<>();
        factors.add(new Hardware());
        factors.add(new SystemSoftware());
        return factors;
    }
    
    @Override
    public List<Goal> getGoals() {
        return null;
    }
}
