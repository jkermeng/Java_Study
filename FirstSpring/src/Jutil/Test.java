package Jutil;

import Server.ProductService;
import bean.Demo;
import bean.Maker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Spring config.xml");
//        Demo demo = (Demo) classPathXmlApplicationContext.getBean("demo");
//        System.out.println(demo.getName());
//        System.out.println(demo.getId());
//        demo.paly();
        ApplicationContext contest = new ClassPathXmlApplicationContext(new String[]{"Spring config.xml"});
        Demo demo = (Demo) contest.getBean("Demo");
        System.out.println(demo.getId());
        System.out.println(demo.getName());
        Maker maker = (Maker) contest.getBean("Maker");
        String make = maker.make();
        System.out.println(make);
        ProductService productService = (ProductService) contest.getBean("ProductService");
        productService.dosomeService();

    }
}
