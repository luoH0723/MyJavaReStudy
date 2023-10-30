package com.lh.operator;

/**
 * @BelongsProject: MyJavaReStudy
 * @BelongsPackage: com.lh.operator
 * @Author: LHao
 * @CreateTime: 2023-10-30  12:30
 * @Description: TODO
 * @Version: 1.0
 */
public class Demo {



    public static void main(String[] args) {
//        int a=3;
//        int b=a++;
//
//        int g = 3;
//        int d = 5;
//
//
//        Demo demo = new Demo();
//        demo.fun1(g);
//        System.out.println(g);
//        demo.fun2(g);
//        System.out.println(g);
//        demo.fun3(g);
//        System.out.println(g);
//        demo.fun4(g);
//        System.out.println(g);

        int a=10;
        int b=20;
        String s = a + b + "";
        System.out.println(s);


//        System.out.println(e);


//        System.out.println(a);
//
//        int c=++a;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }

    int fun1(int n){
        return n++;
    }

    void fun2(int n){
        n++;
    }


    int fun3(int n){
        return ++n;
    }

    void fun4(int n){
        ++n;
    }

}
