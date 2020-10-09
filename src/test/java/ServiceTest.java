import com.chen.dao.UserMapper;
import com.chen.pojo.Index;
import com.chen.pojo.User;
import com.chen.service.IndexService;
import com.chen.service.IndexServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    @Test
    public void IndexTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IndexService indexService = context.getBean("IndexServiceImpl",IndexService.class);
        List<Index> list = indexService.getIndex();

        for (Index index : list) {
            System.out.println(index);
        }
    }

    @Test
    public void LoginTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        User user1 = new User();
        user1.setUserName("Magic284");
        user1.setUserPw("0304chen!");
        System.out.println("user1"+user1);
        User user = userMapper.loginCheck(user1);
        System.out.println(user);
    }
}
