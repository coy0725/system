package com.coy.introduction.systematic.thinking.model;

/**
 * <p/> 传染病模型-《模型思维》
 * 这个模型由易感者、感染者和痊愈者组成，可以给出传染病的发生概率。利用这个模型，我们可以推导出一个传染阈值，也就是一个临界点
 * 超过这个临界点，传染病就会传播。我们还可以确定，为了阻止传染病传播，需要接种疫苗人数的比例。
 * @author coy
 * @since 2021/4/21
 **/
public interface EpidemicModel extends  MathematicalProbabilityModel{
}
