import com.aoptest.config.AppConfig;
import com.aoptest.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService us = (UserService) app.getBean("sv");
        us.ff1();
        us.ff2();
        us.ff3();
        us.ff4();
        us.ff5();
    }
}
