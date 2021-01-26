package com.edison;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo4 {
    public static void main(String[] args) {
//        List<String> errorStoreList = new ArrayList<String>();
//        errorStoreList.add("110101");
//        errorStoreList.add("110102");
//        System.out.println(errorStoreList.toString());
        List<String> errorStoreList = new ArrayList<String>();
        String errorMsg = "";
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    test1();
                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
//                    System.out.println(ex);
//                    System.out.println(ex.toString());
//                    System.out.println(ex.fillInStackTrace());
//                    System.out.println(ex.getStackTrace().toString());
                    errorMsg+="门店：【"+i+"】同步库存失败，错误信息为：\n"+ex.toString()+"\n";
                    errorStoreList.add(i + "");
                }
                System.out.println("执行完毕");
            }
            if(errorStoreList.size()>0){
                throw new Exception(errorMsg);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(errorStoreList.toString());
        }

    }

    public static void test1() throws Exception {
        List<String> errorStoreList = new ArrayList<String>();
        System.out.println(errorStoreList.get(0));
    }
}
