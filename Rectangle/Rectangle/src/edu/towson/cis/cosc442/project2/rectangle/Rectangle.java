package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The point2. */
	private Point point1, point2;
	private double deltaX, deltaY;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param point1 the point1
	 * @param point2 the point2
	 */
	Rectangle(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
		deltaX = point2.getX() - point1.getX();
		deltaY = point2.getY() - point1.getY();
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		return Math.abs(deltaX * deltaY);
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}
}
