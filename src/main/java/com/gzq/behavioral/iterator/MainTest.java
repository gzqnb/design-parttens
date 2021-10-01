package com.gzq.behavioral.iterator;

import java.util.Iterator;

public class MainTest {
    public static void main(String[] args) {
        GZQ gzq = new GZQ();
        gzq.likeYou("sss");
        gzq.likeYou("vvv");
        gzq.likeYou("bbb");
        BeautifulMan.Itr iterator = gzq.getIterator();
        String s = iterator.firstLove();
        System.out.println(s);
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
