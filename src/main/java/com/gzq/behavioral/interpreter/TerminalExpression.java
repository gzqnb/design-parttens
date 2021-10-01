package com.gzq.behavioral.interpreter;

import java.util.Set;

public class TerminalExpression extends IDCardExpression {
    Set<String> data;//免费数据
    String symbol;//定义解析用的符号如 : -

//    private IDCardExpression childExp;

    public TerminalExpression(Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpret(String expression) {
        //先按照指定符号分割
        String[] split = expression.split(symbol);
        boolean res = false;
        for (String s : split) {
            if (data.contains(s)) {
                return true;//说明是免费信息里面的
            }
        }
        //可以继续自解析
//        childExp.interpret(expression);
//不再免费行列
        return false;
    }
}
