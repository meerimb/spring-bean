package peaksoft;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name ="cat")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cat myCat(){
        return new Cat();
    }

}
