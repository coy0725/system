package com.coy.introduction.systematic.thinking.structrue;

import com.coy.introduction.systematic.thinking.relation.ComponentRelation;

import java.util.List;

/**
 * 设备
 * 不只是部件的组合，还是部件与部件间关系的组合
 * @author coy
 * @since 2021/4/16
 **/
public class Equipment {
    List<Component> components;
    List<ComponentRelation> componentRelations;
}
