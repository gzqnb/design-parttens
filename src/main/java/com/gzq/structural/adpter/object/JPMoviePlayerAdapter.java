package com.gzq.structural.adpter.object;

import com.gzq.structural.adpter.Player;
import com.gzq.structural.adpter.Translator;
import com.gzq.structural.adpter.Zh_JPTranslator;

//组合的方式：类结构模型，适配转换到了翻译器的功能上
public class JPMoviePlayerAdapter implements Player {
    ///组合的方式
    private Translator translator = new Zh_JPTranslator();
    private Player target;//被适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }
    @Override
    public String play() {
        String content = target.play();
        //转换字幕
        String translate = translator.translate(content);
        System.out.println(translate);
        return translate;
    }
}
