package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //não precisava ser add. 
	}

	protected Board getBoard() {
		return board;
	}
	

}
