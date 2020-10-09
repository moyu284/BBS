import com.chen.dao.ForumsMapper;
import com.chen.dao.ThreadsMapper;
import com.chen.dao.TopicMapper;
import com.chen.dao.UserMapper;
import com.chen.pojo.Forums;
import com.chen.pojo.Threads;
import com.chen.pojo.Topic;
import com.chen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void ForumsTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ForumsMapper forumsMapper = context.getBean("forumsMapper",ForumsMapper.class);

        System.out.println(forumsMapper.queryForumsByFid(1));
    }

    @Test
    public void ThreadsTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ThreadsMapper threadsMapper = context.getBean("threadsMapper",ThreadsMapper.class);

        System.out.println(threadsMapper.queryThreadByTid(1));
    }

    @Test
    public void TopicTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TopicMapper topicMapper = context.getBean("topicMapper",TopicMapper.class);

        System.out.println(topicMapper.queryTopicByPid(1));
    }

    @Test
    public void UserTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);

        for (User user : userMapper.queryAllUser()) {
            System.out.println(user);
        }
    }
}
