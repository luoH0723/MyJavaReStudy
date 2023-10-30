package com.lh.base;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @BelongsProject: MyJavaReStudy
 * @BelongsPackage: com.lh.base
 * @Author: LHao
 * @CreateTime: 2023-10-29  23:43
 * @Description: TODO
 * @Version: 1.0
 */




public class FunDemo01 {

    public static void main(String[] args) {
        FunDemo01 demo01 = new FunDemo01();
        demo01.functionTest();
        demo01.consumerTest();
        demo01.supplierTest();
        demo01.predicateTest();

    }
    public void functionTest(){
//        非Lambda表达式
//        Function function = new Function<String,String>(){
//            @Override
//            public String apply(String s) {
//                return s;
//            }
//        };
//        System.out.println("函数型接口 :{}",function.apply("没有使用Lambda表达式"));

        Function function = s -> s;
        System.out.println("函数型接口："+function.apply("Function Demo"));
    }

    public void consumerTest(){
//        非Lambda表达式
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        consumer.accept("消费型函数：没有使用Lambda表达式");

//        使用Lambda表达式
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("消费型函数：Consumer Demo");

    }
    public void supplierTest(){
//        非Lambda表达式
//        Supplier supplier = new Supplier<String>(){
//            @Override
//            public String get() {
//                return "供给型接口：没有使用Lambda表达式";
//            }
//        };
//        System.out.println(String.valueOf(supplier.get()));

        Supplier supplier =  () -> "供给型接口：Supplier Demo";
        System.out.println(String.valueOf(supplier.get()));
    }
    public void predicateTest() {
//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals("Predicate Demo");
//            }
//        };
//        System.out.println("断言型接口：{}",predicate.test("没有使用Lambda表达式"));
        Predicate<String> predicate = s -> s.equals("Predicate Demo");
        System.out.println("断言型接口："+predicate.test("Predicate Demo"));
    }

}