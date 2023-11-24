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

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir")+"/src/test/java/resources/");
        System.out.println("/Users/atifahussain/Desktop/QA_folder/MavenProject/src/test/java/resources/SubmitToll");
    }


}
