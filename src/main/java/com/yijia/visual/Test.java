package com.yijia.visual;

import java.util.ArrayList;
import java.util.List;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/08/03 18:05:53
 * @version:1.0
 */
public class Test {
    /*给定一段字符串，以A作为分割界限进行分割，然后所有词组进行反转，同时每个词组除大A外进行字母反转，注意边界与特殊情况。
    例如输入为：AAabcAAdefA
    分割后为：A Aabc A Adef A
    反转后为：A Afed A Acba A

    例如输入为： abcdAdefAAabc
    分割后为：abcd Adef A Aabc
    反转后为：Acba A Afed dcba*/
    public static void main(String[] args) {
        String in = System.in.toString();
        String constant = "A";
        List<String> list = new ArrayList<>();
        int lastIndex = 0;
        for (int i = 0 ; i < in.length(); i++) {
            String current = String.valueOf(in.charAt(i));
            if (constant.equals(current)) {

            }

        }
    }
}
