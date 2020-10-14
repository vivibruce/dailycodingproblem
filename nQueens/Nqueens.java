import java.util.*;
class Nqueens{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int board[] = new int[n+1];
		Nqueens nqueens = new Nqueens();
		nqueens.placeQueens(board, 1, n);

	}
	void placeQueens(int[] board, int nthqueen, int boardSize)
	{
		for(int colPos=1;colPos<=boardSize;colPos++)
		{
			if(isSafe(board, nthqueen, colPos)){
				board[nthqueen] = colPos;
				if(nthqueen == boardSize)
				{
					for(int i=1;i<=boardSize;i++)
					{
						System.out.print(board[i]+"\t");

					}
					System.out.println();

				}
				else
					placeQueens(board, nthqueen+1, boardSize);
			}
		}
	}

	Boolean isSafe(int[] board, int rowPos, int colPos)
	{
		for(int j=1;j<=rowPos-1;j++)
		{
			if(board[j]==colPos || Math.abs(board[j]-colPos)==Math.abs(j-rowPos))
				return false;
		}
		return true;
	}


}