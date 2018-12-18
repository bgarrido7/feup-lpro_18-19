package game;

import java.util.ArrayList;

/**
 * This is the Piece Class. It is an abstract class from which all the actual pieces are inherited.
 * It defines all the function common to all the pieces
 * The move() function an abstract function that has to be overridden in all the inherited class
 * It implements Cloneable interface as a copy of the piece is required very often
 */
public abstract class Figure implements Cloneable{

	//Member Variables
	private int color;
	private String id=null;
	private String path;
	private int steps;
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  //Protected (access from child classes)
	public abstract ArrayList<Cell> move(Cell pos[][],int x,int y, int steps);  //Abstract Function. Must be overridden
	
	//Id Setter
	public void setId(String id)
	{
		this.id=id;
	}
	
	//Path Setter
	public void setPath(String path)
	{
		this.path=path;
	}
	
	//Color Setter
	public void setColor(int c)
	{
		this.color=c;
	}
	
	//Path getter
	public String getPath()
	{
		return path;
	}
	
	//Id getter
	public String getId()
	{
		return id;
	}
		public int getSteps()
		{
			return steps;
		}
		public void setSteps(int steps)
		{
			this.steps=steps;
		}
	//Color Getter
	public int getcolor()
	{
		return this.color;
	}
	
	//Function to return the a "shallow" copy of the object. The copy has exact same variable value but different reference
	public Figure getcopy() throws CloneNotSupportedException
	{
		return (Figure) this.clone();
	}
}