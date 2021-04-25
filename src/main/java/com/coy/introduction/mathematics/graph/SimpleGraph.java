package com.coy.introduction.mathematics.graph;

import com.coy.introduction.systematic.thinking.relation.graph.Edge;

import java.util.List;

/**
 * 设G是一个图，如果G中没有环，而且任意两个顶点之间最多只有一条边，
 * 则称G为简单图（simple graph）或单图；否则称为伪图{@link PseudoGraph}.
 * @author coy
 * @since 2021/4/25
 **/
public class SimpleGraph<V,Rod> implements Graph {
    /**
     * 只有对象与其他对象的关系，简单图中的边都是杆
     * 对象之间最多只有一种关系：    简单图中任意两个顶点之间最多只有一条边，
     * @return
     */
    @Override
    public List<Rod> getEdges() {
        return null;
    }
}
