package javafx.jfx1207.java;

/**创建JXF应用程序
 *创建一个类继承JFX的Application类，且必须实现Application类的start()方法
 *
 * 启动JFX的方法
 *  在主函数里执行launch()方法。
 *  launch()方法有两种参数类型：
 *      launch(String... args) 和main方法在同一个类里时
 *      launch(Class<? extends Application> appClassString... args) 和main方法在不同一个类里时
 *
 * JFX的生命周期
 * 初始化
 * 启动
 * 结束
 * 分别对应Application中的三个方法一般只需要重写start（）方法其他两个方法用父类的就完全ojbk
 * 在main中调用launch（）时会自动调用init（）和Start（） 程序被点击关闭时自动触发stop（）
 *
 * java相对路径默认根路径是project和html等前端语言不同，这里花了很长时间才用相对路径把图片显示出来
 * 且Image（）的字符串路径前 本地也要加上 file：，远程要加上http：
 *
 *
 */