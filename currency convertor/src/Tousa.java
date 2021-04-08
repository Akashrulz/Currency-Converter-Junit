import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tousa {

	@Test
	void tousa() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(4);
		Thread.sleep(1000);
		c.inputtext.setText("222.03");
		Thread.sleep(1000);
		c.usa.doClick();
		Thread.sleep(1000);
		double a = Double.parseDouble(c.outputtext.getText());
		double b = 3.33045;
		assertEquals(b,a,"Test Failed");
	}

}
