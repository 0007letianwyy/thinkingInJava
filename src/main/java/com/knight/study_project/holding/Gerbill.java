package com.knight.study_project.holding;

import java.util.ArrayList;

/**
 * 沙鼠
 * @Author: knight
 * @Date: 2018/11/6 上午10:52
 */

public class Gerbill {
    private static int billNumber;
    private final int count = billNumber++;
    public int getBillNumber(){
        return count;
    }
    public void hop(){
        System.out.println(getBillNumber() + " is jumpping!");
    }

    public static void main(String[] args) {
        ArrayList<Gerbill> arrayList = new ArrayList<>();
        arrayList.add(new Gerbill());
        arrayList.add(new Gerbill());
        arrayList.add(new Gerbill());
        arrayList.add(new Gerbill());
        for (Gerbill gerbill : arrayList) {
            gerbill.hop();
        }
    }
}
