package cn.lhz.lyt;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LytApplicationTests {

	@Autowired
	private UserMapper mapper;
	@Test
	public void testSql() {
		User user = new User();
		user.setUserId("qwewqe");
		mapper.insert(user);
	}

}
