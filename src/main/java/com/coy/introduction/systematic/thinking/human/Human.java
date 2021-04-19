package com.coy.introduction.systematic.thinking.human;

import com.coy.introduction.systematic.thinking.pattern.ThinkPattern;

/**
 * @author coy
 * @since 2021/4/16
 **/
public interface Human {
    
    default ThinkPattern getThinkPattern(){
        return null;
    };
}
