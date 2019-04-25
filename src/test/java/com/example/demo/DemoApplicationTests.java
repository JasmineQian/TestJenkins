package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    private static void test3() {
        int a[] = new int[2];
        int b =a.length;
        System.out.println(b);
        //System.out.println("a[3]:" + a[3]);
    }

    @Test
    public void test() {
        test3();
        }

}
