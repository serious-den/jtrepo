package org.jazzteam.model.liveTest;

import org.junit.Test;

//@ToStringDen
public class TargetDen {
    public String a;

    @Test
    public void logic() {
        Integer i = 65;
        final String s = "hello";
        String plus = s + "" + i.toString();
    }
}
