package com.gzq.behavioral.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 游戏服务器
 * 管理者
 */
public class GamerServer {
    Map<Integer,GameRecord> records = new HashMap<>();
int i = 1;
    //管理备忘录信息的
    void add(GameRecord gameRecord){
        gameRecord.setId(i++);
        records.put(gameRecord.id,gameRecord);
    }

    GuoGamer getRecord(Integer id) throws InvocationTargetException, IllegalAccessException {
        GameRecord gameRecord = records.get(id);
        //获取到备忘录里面的内容以后还要逆转
        GuoGamer guoGamer = new GuoGamer();
        BeanUtils.copyProperties(guoGamer,gameRecord);
        return guoGamer;
    }
}
