package com.codezd;
/**
 * Created by codezd.com on 14-6-2.
 */
public class Minstrel {
//    前置通知
    public void singBeforeQuest() {
        System.out.println(
                "骑士探险前诗人吟诗！>>>>>");
    }
//后置通知
    public void singAfterQuest() {
        System.out.println(
                "骑士探险后诗人吟诗！<<<<<<");

    }
}
