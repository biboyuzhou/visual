package com.yijia.visual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/08/03 18:11:38
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        String input1 = "AAabcAAdefA";
        String input2 = "abcdAdefAAabc";

        System.out.println("输入: " + input1);
        System.out.println("输出: " + reverseSegments(input1));

        System.out.println("\n输入: " + input2);
        System.out.println("输出: " + reverseSegments(input2));
    }

    public static String reverseSegments(String s) {
        if (s == null || s.isEmpty()) return "";

        // 1. 分割字符串
        List<String> segments = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                // 结束当前段并开始新段
                if (current.length() > 0) {
                    segments.add(current.toString());
                    current.setLength(0);
                }
                // 新段以A开头
                current.append('A');
            } else {
                // 继续当前段
                current.append(c);
            }
        }

        // 添加最后一段
        if (current.length() > 0) {
            segments.add(current.toString());
        }

        System.out.println("切分之后数组反转前数组：" + segments);
        // 2. 反转段顺序
        Collections.reverse(segments);

        // 3. 处理每段内容
        List<String> resultSegments = new ArrayList<>();
        for (String seg : segments) {
            if (seg.startsWith("A")) {
                // 处理以A开头的段
                if (seg.length() > 1) {
                    // 反转除A外的字符
                    String reversed = new StringBuilder(seg.substring(1)).reverse().toString();
                    resultSegments.add("A" + reversed);
                } else {
                    // 只有A的情况
                    resultSegments.add("A");
                }
            } else {
                // 反转整个非A段
                resultSegments.add(new StringBuilder(seg).reverse().toString());
            }
        }

        // 4. 拼接最终结果
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultSegments.size(); i++) {
            sb.append(resultSegments.get(i));
            if (i != resultSegments.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
