package com.lsc.personal.tools.gui;

import com.lsc.personal.tools.gui.gui.button.MyButton;
import com.lsc.personal.tools.gui.gui.constant.SystemConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Map;

/**
 * @Description: gui界面
 * @Author: lisc
 * @date: 2023/6/18
 * 实现ApplicationRunner 类, 可以在容器启动后启动这个类, 且必须添加到容器中(@Component)
 * 注意 这个类必须和PersonalToolsGuiApplication(启动类在同级目录或其子目录下)
 */
@Component
@Slf4j
public class SwingArea extends JFrame implements ApplicationRunner {

    private static SwingArea instance = null;
    @Autowired
    ApplicationContext applicationContext;


    public static SwingArea getInstance() {
        if (null == instance) {
            synchronized (SwingArea.class) {
                if (null == instance) {
                    instance = new SwingArea();
                }
            }
        }
        log.info("getInstance");
        return instance;
    }


    private void initUI() {

        // gui标题
        setTitle("工具窗口");

        JFrame.setDefaultLookAndFeelDecorated(true);

        // 窗口大小
        setSize(SystemConstant.FRAME_WIDTH, SystemConstant.FRAME_HEIGHT);

        // 3代表EXIT_ON_CLOSE(在 JFrame 中定义)：使用 System exit 方法退出应用程序。仅在应用程序中使用。
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 窗口设置到屏幕居中
        setLocationRelativeTo(null);

        //窗体大小默认不可变
        setResizable(false);

        //为内容面板设置布局管理器
        setLayout(new BorderLayout());
        Container container = getContentPane();

        //默认为0，0；水平间距10，垂直间距5
        container.setLayout(new BorderLayout(10,5));

        // 上: NORTH  下: SOUTH  左: WEST  右: EAST  中: CENTER
        // 创建顶部容器
        JPanel foundNorthPane = foundNorthPane();

        // 添加顶部容器到主容器中
        container.add(foundNorthPane,BorderLayout.NORTH);

        // 创建底部容器
        JPanel foundSouthPane = FoundSouthPane();

        // 添加底部容器到主容器中
        container.add(foundSouthPane,BorderLayout.SOUTH);

        // 面板添加窗口
      //  setContentPane(contentPane);

        // 设置窗口可见
        setVisible(true);
        log.info("窗口加载完成");

    }

    /**
     * 创建底部容器
     * @return
     */
    private JPanel FoundSouthPane() {

        JPanel southPane = new JPanel(new FlowLayout(FlowLayout.LEFT,8,8));

        JTextArea textArea1 = new JTextArea("请输入内容",15,53);
        textArea1.setLineWrap(true);    //设置文本域中的文本为自动换行
        JTextArea textArea2 = new JTextArea("输出内容",15,53);
        textArea2.setLineWrap(true);    //设置文本域中的文本为自动换行

        // 当文件内容超出容器大小时会出现下拉条
        JScrollPane scroll = new JScrollPane(textArea1);
        // 当文件内容超出容器大小时会出现下拉条
        JScrollPane scroll2 = new JScrollPane(textArea2);

        southPane.add(scroll);
        southPane.add(scroll2);

        return southPane;

    }

    /**
     * 创建顶部容器
     * // 上: NORTH  下: SOUTH  左: WEST  右: EAST  中: CENTER
     */
    private JPanel foundNorthPane() {
        // 顶部容器
        JPanel NorthPane = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
        // 添加按钮到面板
        addAllButton(NorthPane);

        return NorthPane;


    }

    /**
     * 加载所有按钮到面板上
     */
    private void addAllButton(JPanel contentPane) {
        // 根据bean类型获取容器内所有该类型的bean
        Map<String, MyButton> buttonMap = applicationContext.getBeansOfType(MyButton.class);
        log.info("容器中有: {} 个对象", buttonMap.size());

        buttonMap.forEach((key, value) -> {
            MyButton myButton = buttonMap.get(key);
            if (myButton.getIsEnable()) {
                contentPane.add(myButton);
                log.info("添加按钮: {}", myButton.getText());
            }
        });

        log.info("添加按钮结束");
    }

    /**
     * 容器启动后执行此方法
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        initUI();
    }
}
