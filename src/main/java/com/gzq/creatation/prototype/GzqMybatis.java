package com.gzq.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

public class GzqMybatis {

    //缓存
    private Map<String,User> userMap = new HashMap<>();

    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        //从数据库
       if (!userMap.containsKey(username)){
           user = getUserFromDb(username);

       }else {
           //从缓存直接拿，可能脏缓存
           //原型已经拿到，但是不能直接给(本人)
          user =  userMap.get(username);
          //从这个对象快速得到一个克隆体(克隆人) == 原型模式 用克隆体，不要影响我
           user = (User) user.clone();//如果不适用该方法，直接传user那么会直接把user的真实引用直接传出去，它一修改，map里的user也会修改
       }
        return user;
    }

    private User getUserFromDb(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查到"+username);
        User user = new User();
        user.setAge(18);
        user.setName(username);
        userMap.put(username,(User)user.clone());
//        userMap.put(username,user); //如果直接这么放会把user真实引用直接传出去
        return user;
    }
}
