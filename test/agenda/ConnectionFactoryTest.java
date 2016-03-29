package agenda;

import static org.junit.Assert.*;

import org.junit.Test;

import jdbc.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testGetConnection() {
		
		
		ConnectionFactory cfactory = new ConnectionFactory();
		assertNotNull(cfactory.getConnection());
		System.out.println(cfactory.getConnection());
	}

}
