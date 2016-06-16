/**
 * 
 */
package it.polimi.psd.polimed;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Edoardo Longo e Alberto Marini
 *
 */
public class testWebsiteTitle {

	/**
	 * Test method for {@link it.polimi.psd.polimed.WebsiteTitle#getTitle()}.
	 */
	@Test
	public void testGetTitle() {
		assertEquals("PoliMed Welcome Page", new WebsiteTitle().getTitle());
	}

	
	/**
	 * Test method for {@link it.polimi.psd.polimed.WebsiteTitle#setTitle(java.lang.String)}.
	 */
	@Test
	public void testSetTitle() {
		String newTitle = "PoliMed: BetterLife with Science";
		WebsiteTitle title = new WebsiteTitle();
		title.setTitle(newTitle);
		assertEquals(newTitle, title.getTitle());
		
		
		
	}

}
