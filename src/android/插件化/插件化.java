package android.插件化;

public class 插件化 {
    /**
     * 插件化是将一个apk根据业务功能拆分成不同的子apk（也就是不同的插件），每个子apk可以独立编译打包，
     * 最终发布上线的是集成后的apk。在apk使用时，每个插件是动态加载的，插件也可以进行热修复和热更新。
     *
     *     从技术上讲，就是解决如何启动未安装的apk里面的类（主要是四大组件）。
     *     主要问题：如何加载类、如何加载资源、如何管理组件生命周期。
     *
     * 与组件化的主要区别：
     *
     *     形式上的区别，组件化的单位是module，插件化的单位是apk
     *     关注点不同，插件化更关注动态加载、热更新、热修复等‘插拔’技术。
     *
     */
}
