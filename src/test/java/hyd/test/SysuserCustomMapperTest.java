package hyd.test;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysuserCustomMapperTest extends TestCase {

	private ApplicationContext applicationContext;

	protected void setUp() throws Exception {
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml", "spring/applicationContext-dao.xml"

		});
	}

	protected void tearDown() throws Exception {

	}
	
	public void testFindSysuserById() throws Exception {
		
	}

}
