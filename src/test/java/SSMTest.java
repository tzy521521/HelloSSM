import com.zeusjava.kernel.entity.User;
import com.zeusjava.kernel.dao.UserMapper;
import com.zeusjava.kernel.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by LittleXuan on 2015/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class SSMTest {
    private static Logger logger = LoggerFactory.getLogger(SSMTest.class);
    @Resource
    private IUserService userService;

    @Test
    public void testUser(){
        logger.info("========================Test Begin===========================");

        logger.info("========================Test End ===========================");

    }
}
