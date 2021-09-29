package com.gzq.structural.adpter.clazz;

import com.gzq.structural.adpter.JPMovieAdapter;
import com.gzq.structural.adpter.Player;
import com.gzq.structural.adpter.Translator;
import com.gzq.structural.adpter.Zh_JPTranslator;

//继承的方式：类结构模型，适配转换到了翻译器的功能上
public class JPMoviePlayerAdapter extends Zh_JPTranslator implements Player {
    private Player target;//被适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }
    @Override
    public String play() {
        String content = target.play();
        //转换字幕
        String translate = translate(content);
        System.out.println(translate);
        return translate;
    }
}
