/**
 * 
 */
package fr.ihoover.model;

import java.util.ArrayList;
import java.util.List;

import fr.ihoover.controller.ParserController;
import fr.ihoover.model.enums.OrderEnum;

/**
 *
 */
public class ParameterModel {
	private GridModel grid;
	private IHooverModel iHoover;
	private List<OrderEnum> orders = new ArrayList<OrderEnum>();

	/**
	 * 
	 */
	public ParameterModel() {
		super();
	}

	public ParameterModel(List<String> lines) {
		super();
		if (lines.size() == 3) {
			this.grid = ParserController.parseGrid(lines.get(0));
			this.iHoover = ParserController.parseIHoover(lines.get(1));
			this.orders = ParserController.parseOrders(lines.get(2));
		} else {
			System.err.println("Le fichier ne fait pas 3 lignes");
		}
	}

	/**
	 * @return the grid
	 */
	public GridModel getGrid() {
		return grid;
	}

	/**
	 * @param grid
	 *            the grid to set
	 */
	public void setGrid(GridModel grid) {
		this.grid = grid;
	}

	/**
	 * @return the iHoover
	 */
	public IHooverModel getIHoover() {
		return iHoover;
	}

	/**
	 * @param iHoover
	 *            the iHoover to set
	 */
	public void setIHoover(IHooverModel iHoover) {
		this.iHoover = iHoover;
	}

	/**
	 * @return the order
	 */
	public List<OrderEnum> getOrders() {
		return orders;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrders(List<OrderEnum> orders) {
		this.orders = orders;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParameterModel [Grid=" + grid + ", IHoover=" + iHoover + ", orders=" + orders + "]";
	}

}
