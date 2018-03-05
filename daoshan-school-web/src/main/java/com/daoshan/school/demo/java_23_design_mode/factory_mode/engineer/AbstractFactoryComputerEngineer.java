package com.daoshan.school.demo.java_23_design_mode.factory_mode.engineer;

import com.daoshan.school.demo.java_23_design_mode.factory_mode.factory.AbstractFactory;
import com.daoshan.school.demo.java_23_design_mode.factory_mode.factory.CpuFactory;
import com.daoshan.school.demo.java_23_design_mode.factory_mode.factory.MainBoardFactory;
import com.daoshan.school.demo.java_23_design_mode.factory_mode.interfacer.Cpu;
import com.daoshan.school.demo.java_23_design_mode.factory_mode.interfacer.MainBoard;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryComputerEngineer {
    /**
     * 定义组装机需要的CPU
     */
    private Cpu cpu = null;
    /**
     * 定义组装机需要的主板
     */
    private MainBoard mainboard = null;

    public void makeComputer(AbstractFactory factory){
        /**
         * 组装机器的基本步骤
         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(factory);
        //2:组装机器
        //3:测试机器
        //4：交付客户
    }
    private void prepareHardwares(AbstractFactory factory){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = factory.CreateCpu();
        this.mainboard = factory.CreateMainBoardu();

        //测试配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
