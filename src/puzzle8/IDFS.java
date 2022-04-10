package puzzle8;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Klasse puzzle8.IDFS für iterative deepening depth-first search
 * @author Paul Rueß
 */
public class IDFS {

	private static Deque<Board> dfs(Board curBoard, Deque<Board> path, int limit) {
		// ...
		return null;
	}
	
	private static Deque<Board> idfs(Board curBoard, Deque<Board> path) {
		for (int limit = 5; limit < Integer.MAX_VALUE; limit++) {
			Deque<Board> result = dfs(curBoard,path,limit);
			if (result != null)
				return result;
		}
		return null;
	}
	
	public static Deque<Board> idfs(Board curBoard) {
		Deque<Board> path = new LinkedList<>();
		path.addLast(curBoard);
		Deque<Board> res =  idfs(curBoard, path); 
		return res;
	}
}
