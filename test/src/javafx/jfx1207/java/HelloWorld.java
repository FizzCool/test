package javafx.jfx1207.java;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @ClassName: HelloWorld
 * @Description: 启动方式一
 * @Author: 梁飞
 * @Date: 2019/12/7
 */
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("正在初始化...");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HelloWorld");
        primaryStage.getIcons().add(new Image(("file:src/javafx/jfx1207/lib/java1.png")));
        /*//设置最小化默认为false
        primaryStage.setIconified(true);
        //设置是否最大化默认为false
        primaryStage.setMaximized(true);*/
        //设置窗口宽度
        primaryStage.setWidth(800);
        //设置窗口高度
        primaryStage.setHeight(600);
        //设置窗口大小是否可调整
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("执行结束");
        super.stop();
    }
}
