import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat catbean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catbean.getMessage());
        Cat catbean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catbean2.getMessage());


        System.out.println("bean'ов HelloWorld" + (bean == bean2));

        System.out.println("bean'ов Cat" + (catbean == catbean2));
    }
}