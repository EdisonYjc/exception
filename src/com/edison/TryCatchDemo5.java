package com.edison;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo5 {
    public static void main(String[] args) {
        List<String> errorStoreList = new ArrayList<String>();
        //针对单个数据try...catch不会影响循环中的其它数据执行
        for (int i = 0; i < 10; i++) {
            try {
                test1(i);
            } catch (Exception ex) {
                errorStoreList.add(i + "");
                ex.printStackTrace();
            }
            System.out.println("店铺"+i+"执行完毕");
        }
    }

    public static void test1(int i) throws Exception {
        List<String> errorStoreList = new ArrayList<String>();
        //模拟部分数据异常
        if(i==2||i==7){
            throw new Exception("测试异常");
        }

    }
}
