package com.gzq.behavioral.chain.ext;

//1--2--3--my--3--2--1
public class MainTest {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        HttpFilter filter = new HttpFilter();
        CharacterFilter characterFilter = new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();
        chain.addFilter(filter);
        chain.addFilter(characterFilter);
        chain.addFilter(encodingFilter);

        chain.setTarget(new My());
        //filter如何链式执行
        chain.doFilter(new Request("hello"),
                new Response("adfdf"),chain);
    }
}
