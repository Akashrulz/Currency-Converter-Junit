import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class torussia {

	@Test
	void torussia() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(1);
		Thread.sleep(1000);
		c.inputtext.setText("1245");
		Thread.sleep(1000);
		c.russia.doClick();
		Thread.sleep(1000);
		double a = Double.parseDouble(c.outputtext.getText());
		double b = 80812.95;
		assertEquals(b,a,"Test Failed");
	}

}