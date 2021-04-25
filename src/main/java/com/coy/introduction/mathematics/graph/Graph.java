package com.coy.introduction.mathematics.graph;

import com.coy.introduction.systematic.thinking.relation.graph.Edge;

import java.util.List;

/**
 * 图 用来表示对象和对象关系
 * 定义：一个图G是一个有序三元组G=<V，E，φ>.其中：
 * （1）V是非空顶点集合； 即对象集合，对象数量不能为空
 * （2）E是边（edge）集合，E∩V=Æ；边即对象关系 使用两个顶点来表示
 * （3）φ是E到对象关系的映射，称为关联函数（incidence function）（当E为空集时，允许φ不存在）.uv=vu，u，v∈V.
 * @author coy
 * @since 2021/4/24
 **/
public interface Graph <V extends Vertices, E extends Edge>{
    
    /**
     * 返回图的顶点
     * @return
     */
    default List<V> getVertices(){
        return null;
    }
    
    /**
     * 返回图的边数
     * @return
     */
    default List<E> getEdges(){
        return null;
    }
    
    /**
     * 返回图的阶数
     * @return
     */
    default Integer getOrder(){
        return getVertices().size();
    }
}
