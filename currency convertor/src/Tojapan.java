import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tojapan {

	@Test
	void tojapan() throws InterruptedException
	{
		convertor c = new convertor();
		c.frame.setVisible(true);
		c.country.setSelectedIndex(4);
		Thread.sleep(1000);
		c.inputtext.setText("25");
		Thread.sleep(1000);
		c.japan.doClick();
		Thread.sleep(1000);
		double a = Double.parseDouble(c.outputtext.getText());
		double b = 41.25;
		assertEquals(b,a,"Test Failed");
	}

}