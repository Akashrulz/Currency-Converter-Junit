import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Toindia {

	@Test
	void toindia() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(3);
		Thread.sleep(1000);
		c.inputtext.setText("121.03");
		Thread.sleep(1000);
		c.india.doClick();
		Thread.sleep(1000);
		double a = Double.parseDouble(c.outputtext.getText());
		double b = 79.8798;
		assertEquals(b,a,"Test Failed");
	}

}
