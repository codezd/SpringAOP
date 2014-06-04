package test;
import com.codezd.Knight;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by codezd.com on 14-6-2.
 */
public class KnightMain {
    public static void main(String[] args) {
//        Log4j不在默认的路径下的配置
        PropertyConfigurator.configure("src/com/codezd/resources/log4j.properties");
//        spring配置文件不在默认路径下的配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/codezd/resources/knights.xml");

        Knight knight = (Knight) context.getBean("knight");

        knight.embarkOnQuest();
    }
}
