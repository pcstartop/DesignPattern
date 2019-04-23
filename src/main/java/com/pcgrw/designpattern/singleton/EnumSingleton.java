package com.pcgrw.designpattern.singleton;

/**
 * 单例模式-枚举类
 * （线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用）
 */
public enum EnumSingleton {
    INSTANCE;

    public void whateverMethod() {
    }
}
