package com.coy.introduction.systematic.thinking.group;

import com.coy.introduction.systematic.thinking.pattern.ThinkPattern;

/**
 * @author coy
 * @since 2021/4/18
 **/
public interface Group {
    /**
     * 群体{@link Group}采用一组共同的标准思维类型，用来简化内部交流过程
     * 但这些内部交流的思维类型越有效，用来与外界交流也越困难
     * @param standardThinking 标准思维类型（表现为专门的词汇和短语）
     */
    void simplyCommunication(ThinkPattern standardThinking);
}

