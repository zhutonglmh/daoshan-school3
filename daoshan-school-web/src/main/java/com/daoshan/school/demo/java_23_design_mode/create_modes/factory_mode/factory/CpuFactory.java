package com.daoshan.school.demo.java_23_design_mode.create_modes.factory_mode.factory;

import com.daoshan.school.demo.java_23_design_mode.create_modes.factory_mode.interfacer.Cpu;
import com.daoshan.school.demo.java_23_design_mode.create_modes.factory_mode.classer.AmdCpu;
import com.daoshan.school.demo.java_23_design_mode.create_modes.factory_mode.classer.IntelCpu;

/**
 * cpu 工厂
 */
public class CpuFactory {

    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
