# 设计模式

## 一、创造者模式
### 1、[单例模式](src/main/java/singleton)
* [饿汉式（静态变量）](src/main/java/singleton/Singleton01.java)
* [饿汉式（静态代码块）](src/main/java/singleton/Singleton02.java)
* [懒汉式（线程不安全）](src/main/java/singleton/Singleton03.java)
* [懒汉式（线程安全）](src/main/java/singleton/Singleton04.java)
* [懒汉式（双重检查）](src/main/java/singleton/Singleton05.java)
* [懒汉式（静态内部类）](src/main/java/singleton/Singleton06.java)
* [枚举](src/main/java/singleton/Singleton07.java)
#### 破坏单例模式
* [反序列化](src/main/java/singleton/BrokenByDeserialization.java)
* [反射](src/main/java/singleton/BrokenByDeserialization.java)
### 2、[工厂模式](src/main/java/factory)
* [简单工厂模式](src/main/java/factory/simple)
* [工厂方法模式](src/main/java/factory/method)
* [抽象工厂模式](src/main/java/factory/_abstract)
* [扩展：简单工厂模式+配置文件](src/main/java/factory/config)
### 3、[原型模式](src/main/java/prototype)
* [浅拷贝](src/main/java/prototype/shallow) （[案例](src/main/java/prototype/demo)）
* [深拷贝](src/main/java/prototype/deep)
### 4、[建造者模式](src/main/java/builder)
* [案例](src/main/java/builder/demo1)
* [扩展](src/main/java/builder/demo2)
## 二、结构型模式
### 1、[代理模式](src/main/java/proxy)
* [静态代理](src/main/java/proxy/static_proxy)
* [JDK动态代理](src/main/java/proxy/jdk)
* [CGLIB动态代理](src/main/java/proxy/cglib_proxy)
### 2、[适配器模式](src/main/java/adapter)
* [类适配器模式](src/main/java/adapter/class_adapter)
* [对象适配器模式](src/main/java/adapter/object_adapter)
### 3、[装饰者模式](src/main/java/decorator)
### 4、[桥接模式](src/main/java/bridge)
### 5、[外观模式(门面模式)](src/main/java/facade)
### 6、[组合模式(部分整体模式)](src/main/java/combination)
### 7、[享元模式](src/main/java/flyweight)
## 三、行为型模式
### 1、[模板方法模式](src/main/java/template)
### 2、[策略模式](src/main/java/strategy)
### 3、[命令模式](src/main/java/strategy)
### 4、[责任链模式](src/main/java/responsibility)
### 5、[状态模式](src/main/java/state)