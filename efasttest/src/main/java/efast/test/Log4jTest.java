package efast.test;


import org.apache.log4j.Logger;
/**
 * @author mmb
 * @function test log4j
 * */
public class Log4jTest {
	
	private static Logger logger = Logger.getLogger(Log4jTest.class);  
	
	public static void main(String [] args){
		
		//BasicConfigurator.configure(); //自动快速地使用缺省Log4j环境。
		
		logger.info("aaaa");
		
		logger.debug("bbbb");
		
		logger.error("cccc");
		
	}
}