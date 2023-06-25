package com.lsc.personal.tools.gui.configuration;

import com.lsc.personal.tools.gui.gui.button.MyButton;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/18
 */
@Component
public class ButtonBeanConfig {

    @Bean
    public JButton button01(){
      return   new MyButton("测试",true);
    }

    @Bean
    public JButton button02(){
        return   new MyButton("测试2",true);
    }

    @Bean
    public JButton button03(){
        return   new MyButton("测试3",true);
    }
}
