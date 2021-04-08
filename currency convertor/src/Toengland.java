import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Toengland {

	@Test
	void toengland() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(0);
		Thread.sleep(1000);
		c.inputtext.setText("3549.8");
		Thread.sleep(1000);
		c.england.doClick();
		Thread.sleep(1000);
		double a = Double.parseDouble(c.outputtext.getText());
		double b = 39.0478;
		assertEquals(b,a,"Test Failed");
	}

}