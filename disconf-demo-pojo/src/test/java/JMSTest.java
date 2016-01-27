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
 
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
        System.out.println("press to exit!");
        System.in.read();
    }
}