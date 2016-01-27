package com.xmutca.config;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ActiveMQ与Spring整合 ===初步整合
 * 1.消费者
 * 2.生产者
 * 3.配置文件
 * 
 * @author Administrator
 *
 */
public class JMSTest {

    @Test
   public void test() throws IOException {
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       ctx.start();

        JedisConfig jedis = ctx.getBean("jedisConfig", JedisConfig.class);

        System.out.println(jedis.getPort());
       System.out.println("press to exit!");
       System.in.read();
   }
}