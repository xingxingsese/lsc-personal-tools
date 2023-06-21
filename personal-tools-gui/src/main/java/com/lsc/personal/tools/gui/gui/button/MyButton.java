package com.lsc.personal.tools.gui.gui.button;

import lombok.Data;

import javax.swing.*;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/18
 */
@Data
public class MyButton extends JButton {
    /**
     * 是否开启按钮
     */
    private Boolean isEnable;

    /**
     * 单击事件
     */
    private Action action;


    public MyButton(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public MyButton(String text, Boolean isEnable, Action action) {
        super(action);
        this.isEnable = isEnable;
        this.action = action;
        this.setName(text);

    }

    public MyButton(String text, Boolean isEnable) {
        super(text);
        this.isEnable = isEnable;
    }
}
