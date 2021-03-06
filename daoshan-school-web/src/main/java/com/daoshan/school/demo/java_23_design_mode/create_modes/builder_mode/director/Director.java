package com.daoshan.school.demo.java_23_design_mode.create_modes.builder_mode.director;

import com.daoshan.school.demo.java_23_design_mode.create_modes.builder_mode.builder.Builder;

public class Director {
    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;
    /**
     * 构造方法，传入建造器对象
     * @param builder 建造器对象
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
