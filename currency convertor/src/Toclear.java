import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Toclear {

	@Test
	void toclear() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(4);
		Thread.sleep(1000);
		c.inputtext.setText("121.03");
		Thread.sleep(1000);
		c.india.doClick();
		Thread.sleep(1000);
		c.clear.doClick();
		Thread.sleep(1000);
		assertEquals(c.inputtext.getText(),"","Test Failed");
		assertEquals(c.outputtext.getText(),"","Test Failed");
	}

}