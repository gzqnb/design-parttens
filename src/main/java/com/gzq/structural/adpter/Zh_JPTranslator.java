package com.gzq.structural.adpter;

public class Zh_JPTranslator implements Translator{
    @Override
    public String translate(String content) {
        if ("你好".equals(content)){
            return "日文:空你几哇";
        }
        if ("什么".equals(content)){
            return "日文:纳尼";
        }
        return "*****";
    }
}
