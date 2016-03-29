package br.ufpr.jdbc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionFactoryTest {

	@Test
	public void testGetConnection() {
		
		
		MySqlConnectionFactory cfactory = new MySqlConnectionFactory();
		assertNotNull(cfactory.getConnection());
		System.out.println(cfactory.getConnection());
	}

}
