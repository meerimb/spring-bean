package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld myBean=
                (HelloWorld) applicationContext.getBean("helloworld") ;
        System.out.println("Ссылаются ли один и тот же объект :"+(bean==myBean));
        System.out.println(bean.getMessage());
        System.out.println(myBean.getMessage());
        System.out.println();

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);

        Cat cat=context.getBean("cat",Cat.class);
        Cat myCat=context.getBean("cat",Cat.class);

        System.out.println("Ссылаются ли один и тот же объект :"+(cat==myCat));
        System.out.println(cat);
        System.out.println(myCat);

        context.close();

    }
}