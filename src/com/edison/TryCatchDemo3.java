package com.edison;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo3 {
    public static void main(String[] args) {
        List<String> errorStoreList = new ArrayList<String>();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    test1(i);
                } catch (Exception ex) {
                    errorStoreList.add(i + "");
                    ex.printStackTrace();
                }
                System.out.println("店铺"+i+"执行完毕");
            }
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("里面进行了try...catch，外层将捕获不到");
            System.out.println(errorStoreList.toString());
        }

    }

    public static void test1(int i) throws Exception {
        List<String> errorStoreList = new ArrayList<String>();
        if(i==2||i==7){
            throw new Exception("测试异常");
        }

    }
}
