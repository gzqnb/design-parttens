package com.gzq.behavioral.interpreter;

/**
 * 身份信息表达式
 * 表达式的解析
 */
public abstract class IDCardExpression {
    /**
     * 定义解析逻辑
     * 假设我们需要解析信息格式为:
     * 上海市:xxx1-医生
     * 武汉市:xxx2-程序员
     * 北京市:xxx3-老人
     * 表达式中,":"以前的是城市，"-"以后的是职业
     */
    abstract boolean interpret(String expression);
}
