package com.gzq.behavioral.memento;

import java.lang.reflect.InvocationTargetException;

/**
 * 1.备忘录的设计(提取属性)
 * 2.备忘对象和源对象的互转操作(BeanUtils属性对拷)
 *     序列化
 *     保存数据库
 */
public class MainTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        GuoGamer guoGamer = new GuoGamer();
        guoGamer.playGame();
        //第一次保存游戏记录
        guoGamer.saveGameRecord();
        guoGamer.playGame();
        guoGamer.playGame();

        guoGamer.saveGameRecord();
        GuoGamer fromMemento = guoGamer.getFromMemento(1);
        fromMemento.playGame();
    }
}
