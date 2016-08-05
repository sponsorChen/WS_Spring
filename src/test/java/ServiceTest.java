import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ServiceTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test()
	{
		System.out.println(userMapper.selectByPrimaryKey(1));
	}
}
