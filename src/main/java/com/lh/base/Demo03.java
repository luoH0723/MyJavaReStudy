package com.lh.base;

/**
 * @BelongsProject: MyJavaReStudy
 * @BelongsPackage: com.lh.base
 * @Author: LHao
 * @CreateTime: 2023-10-30  10:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {


        //类型转换
        // byte,short,char->int->long->float->double   从低到高

        int i=130;
        byte b=(byte)i;
        System.out.println(i+"|"+b);

        //整数 ： 进制  二进制0b  十进制  八进制0  十六进制0x

//        int a =10;
//        int b = 010;
//        int c = 0x10;
//        System.out.println(a+"|"+b+"|"+c);
    }
}
