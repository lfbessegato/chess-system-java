package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/* Acessado somente dentro classe Board 
	 * e de suas sub-classes.
	 */
	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
