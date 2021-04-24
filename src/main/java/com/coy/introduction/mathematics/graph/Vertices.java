package com.coy.introduction.mathematics.graph;

import com.coy.introduction.systematic.thinking.relation.graph.Ring;
import com.coy.introduction.systematic.thinking.relation.graph.Rod;

/**
 * 顶点
 * 使用顶点来表示对象{@link Object}
 * 如果两个不同的对象（顶点u,v）存在关系e,则称u,v是e的端点，u与v是邻接的。
 * 如果对象与对象(u)本身存在关系e,则称e为环{@link Ring}，否则为杆rod{@link Rod}
 * 如果对象（顶点v）与任何对象（包括其本身）存在关系（关联边）则其为孤立对象
 * @author coy
 * @since 2021/4/24
 **/
public interface Vertices {
}
