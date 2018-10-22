package com.knight.study_project.inner;

/**
 * @Author: knight
 * @Date: 2018/10/22 下午6:15
 */

public class JudgeInnerChangeField {
    private int a = 1;

    private class ChangeField {
        private int getA() {
            return a + 2;
        }
    }
    public void printA(){
        ChangeField changeField = new ChangeField();
        System.out.println(changeField.getA());
    }

    public static void main(String[] args) {
        JudgeInnerChangeField field = new JudgeInnerChangeField();
        field.printA();
    }
}
