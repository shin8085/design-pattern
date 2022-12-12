# 设计模式

## 一、创造者模式
### 1、[单例模式](src/singleton)
* [饿汉式（静态变量）](src/singleton/Singleton01.java)
* [饿汉式（静态代码块）](src/singleton/Singleton02.java)
* [懒汉式（线程不安全）](src/singleton/Singleton03.java)
* [懒汉式（线程安全）](src/singleton/Singleton04.java)
* [懒汉式（双重检查）](src/singleton/Singleton05.java)
* [懒汉式（静态内部类）](src/singleton/Singleton06.java)
* [枚举](src/singleton/Singleton07.java)
#### 破坏单例模式
* [反序列化](src/singleton/BrokenByDeserialization.java)
* [反射](src/singleton/BrokenByDeserialization.java)