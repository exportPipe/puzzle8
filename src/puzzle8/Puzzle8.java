package puzzle8;

import java.util.Deque;

/**
 * Hauptprogramm für 8-Puzzle-Problem.
 *
 * @author Paul Rueß
 */
public class Puzzle8 {

    public static void main(String[] args) {
            Board b = new Board();
            System.out.println(b);

            Deque<Board> res = A_Star.aStar(b);
            int n = res == null ? -1 : res.size();
            System.out.println("[A*]   Anz.Zuege: " + n + ": " + res);

            res = IDFS.idfs(b);
            n = res == null ? -1 : res.size();
            System.out.println("[IDFS] Anz.Zuege: " + n + ": " + res);
            System.out.println();
    }
}
