package com.atifa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulation1 {
    String str="String Manipulation Practice";

    @Test
    public void strLength(){

        Assert.assertEquals(str.length(),28);
    }

    @Test
    public void strChar(){

        Assert.assertEquals(str.charAt(8),'a');
    }


}
