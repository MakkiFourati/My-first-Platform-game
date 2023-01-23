/*
 *	Author:      Makki Fourati
 *	Date:        6 déc. 2016
 */
package platform.game;

public class Or implements Signal {
	private final Signal right;
	private final Signal left;
	
	public Or(Signal right, Signal left) { 
		if (right == null || left == null)
			throw new NullPointerException(); 
		this.right = right;
		this.left = left;
	}
	
	@Override
	public boolean isActive() {
		return left.isActive() || right.isActive(); 
	}

	
}
