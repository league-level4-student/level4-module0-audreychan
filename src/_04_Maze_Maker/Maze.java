package _04_Maze_Maker;
import java.awt.Graphics;

public class Maze {
	//1. Create a 2D array of cells. Don't initialize it.
	Cell[][] cells;
	
	private int width;
	private int height;

	public Maze(int w, int h) {
		this.width = w;
		this.height = h;

		//2. Initialize the cells using the width and height variables
		cells = new Cell[w][h];
		//3. Iterated through each cell and initialize it
		//   using i and j as the location
		for(int i = 0; i < width; i++) {
			for(int k = 0; k < height; k++) {
				cells[i][k] = new Cell(i, k);
			}
		}
	}

	//4. This method iterates through the cells and draws them
	public void draw(Graphics g) {
		for(int i = 0; i < width; i++) {
			for(int k = 0; k < height; k++) {
				cells[i][k].draw(g);
			}
		}
	}
	
	//4b. This method returns the selected cell.
	public Cell getCell(int x, int y){
		return  cells[x][y];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
