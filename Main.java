import java.util.*;
public class Main
{
	public static void main(String[] args) {
		char[][] board= new char[3][3];
		for(int row=0;row<board.length;row++){
		    for(int col=0;col<board[row].length;col++){
		        board[row][col]= ' ';
		        //System.out.print(board[row][col]);
		    }
		    
		}
		
		char player= 'X';
		boolean gameOver= false;
		Scanner obj= new Scanner(System.in);
		System.out.println("RULES: \n1. Player needs to enter two imputs\n2.Each input should range from 0-2\n3.First inputs declares rows and second is for columns");
		while(!gameOver){
		    printBoard(board);
		    System.out.println("player " + player + " enter: ");
		    int row= obj.nextInt();
		    int col= obj.nextInt();
		    System.out.println();
		    if(board[row][col]==' '){
		        
		        //for placing the elements
		        
		        board[row][col]= player;
		        
		        gameOver= haveWon(board, player);
		        if(gameOver){
		            System.out.println("player " + player + " won the match");
		        }
		        else{
		            if(player == 'X'){
		                player= '0';
		            }
		            else{
		                player= 'X';
		            }
		        }
		    }
		    else{
		        System.out.println("Invalid move!!. Try again!");
		    }
		}
		printBoard(board);
		
		}
		
		
		public static void printBoard(char[][] board){
		    for(int row=0;row<board.length;row++){
		        for(int col=0;col<board[row].length;col++){
		        //board[row][col]='  ';
		        System.out.print(board[row][col] + " | ");
		    }
		    System.out.println();
		}
		}
		
		public static boolean haveWon(char board[][], char player){
		    for(int row=0;row<board.length;row++){
		        
		        //checking rows
		        if(board[row][0]== player && board[row][1]== player && board[row][2]== player){
		            return true;
		        }
		    }
		     for(int col=0;col<board.length;col++){
		        //checking cols
		        if(board[0][col]== player && board[1][col]== player && board[2][col]== player){
		            return true;
		        }
		     }
		        //checking diagonals
		        if(board[0][0]== player && board[1][1]== player && board[2][2]== player){
		            return true;
		        }
		        if(board[2][0]== player && board[1][1]== player && board[0][2]== player){
		            return true;
		        }
		        return false;
				obj.close();
		    }
		}
	