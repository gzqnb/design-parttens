package com.gzq.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * 游戏者:游戏发起人
 * 当前游戏信息
 */
@Data
public class GuoGamer {
    Integer coin;//剩余金币
    Integer hp;//血量
    Integer mp;//蓝量
    Integer level;//等级
    //以上是内部状态，我们需要记录保存的信息

    GamerServer gamerServer = new GamerServer();
    //保存游戏记录
    void saveGameRecord() throws InvocationTargetException, IllegalAccessException {
        System.out.println("正在保存当前记录...");
        GameRecord gameRecord = new GameRecord();
        //当前游戏信息保存到备忘录
        BeanUtils.copyProperties(gameRecord,this);
        gamerServer.add(gameRecord);
    }

    //从备忘录获取游戏历史存档
    GuoGamer getFromMemento(Integer id) throws InvocationTargetException, IllegalAccessException {
        System.out.println("获取历史存档信息");
        GuoGamer record = gamerServer.getRecord(id);
        return record;
    }

    //玩游戏
    void playGame() {
        int i = new Random().nextInt();
        System.out.println("玩游戏"+i);
        coin = i;
        hp = i;
        mp = i;
        level = i;
    }

    //退出游戏
    void exitGame() throws InvocationTargetException, IllegalAccessException {
        System.out.println("退出&存档");
        saveGameRecord();
    }
}
