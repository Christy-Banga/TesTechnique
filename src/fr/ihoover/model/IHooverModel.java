/**
 * 
 */
package fr.ihoover.model;

import fr.ihoover.model.enums.CompassEnum;

/**
 *
 */
public class IHooverModel {
	private int x;
	private int y;
	private CompassEnum compass;
	private int direction;

	/**
	* 
	*/
	public IHooverModel() {
		super();
	}

	/**
	 * @param x
	 * @param y
	 * @param compass
	 */
	public IHooverModel(int x, int y, CompassEnum compass) {
		super();
		this.x = x;
		this.y = y;
		this.compass = compass;
		// set the direction
		switch (compass) {
		case N:
			this.direction = 0;
			break;
		case E:
			this.direction = 1;
			break;
		case S:
			this.direction = 2;
			break;
		case W:
			this.direction = 3;
			break;
		}

	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;

	}

	public void setDirectionAndCompass(int direction) {
		this.direction = direction % 4;
		switch (this.direction) {
		case 0:
			this.compass = CompassEnum.N;
			break;
		case 1:
			this.compass = CompassEnum.E;
			break;
		case 2:
			this.compass = CompassEnum.S;
			break;
		case 3:
			this.compass = CompassEnum.W;
			break;
		}

	}
	
	/**
	 * @return the orientation
	 */
	public CompassEnum getCompass() {
		return compass;
	}

	/**
	 * @param orientation
	 *            the orientation to set
	 */
	public void setCompass(CompassEnum compass) {
		this.compass = compass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + ", orientation=" + compass + "]";
	}
}
