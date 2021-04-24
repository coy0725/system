package com.coy.introduction.systematic.thinking.relation;

import com.coy.introduction.mathematics.graph.Graph;
import com.coy.introduction.mathematics.graph.Vertices;
import com.coy.introduction.systematic.thinking.element.Factor;

/**
 * 关系
 * 关系反映了元素{@link Factor}之间的联系与性质，如数值之间的相等关系、大于关系以及整除关系。
 * 定义：设A、B为任意两个集合，称笛卡尔积A*B的子集R为集合A到B的一个二元关系。若<x,y>∈R,则x,y
 * 有关系R,记为xRy。否则称x与y没有关系R.
 *
 * <p>现实世界中，有许多问题都可以用两个对象之家的二元关系来描述：用顶点@{@link Vertices}来表示对象，如果两个对象有关系，则用一条线连接代表这两个对象的
 * 两个顶点，例如两国之间的外交关系，城市之间的通信联系等，都可以用这种图的形式来描述，如果我们感兴趣的只是顶点与顶点之间是否有连线，而不
 * 关心这些顶点具体表示什么对象，也不关心连线的长短曲直，那么这种数学对象就是图@{@link Graph}的概念。
 * note：引入概念顶点{@link Vertices}来表示对象，引入概念线来表示对象关系{@link Relation}
 * @author coy
 * @since 2021/4/16
 **/
public interface Relation {
}
