package com.heapspace.solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Sudoko {

	boolean isValidSudoku(char[][] board) {
		for(int i=0 ; i < board.length-1; i+=3) {
			for(int j=0;j < board[i].length-1; j+=3) {
				System.out.println("I: "+i + " J: "+ j);
				//isValidInnerBox(board,i,j,i+2,j+2);
				if(!isValidInnerBox(board,i,j,i+2,j+2)) {
					return false;
				}
			}
		}

		return isValidRow(board)&&isValidCol(board);

	}

	boolean isValidInnerBox(char[][] box, int r, int c, int rEnd, int cEnd){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=r; i <= rEnd; i++){
			for(int j = c; j <= cEnd; j++){
				System.out.println("R: "+ i + " C: "+j);
				int digit = box[i][j]-'0';
				if(digit > 0 && digit < 10) {
					if(!map.containsKey(digit)){
						map.put(digit,1);
					} else{
						return false;
					}
				}
			}
		}
		return true;
	} 

	boolean isValidCol(char[][] box){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i < box.length; i++){
			for(int j=0; j < box[i].length; j++) {
				int digit = box[j][i]-'0';
				if(digit > 0 && digit < 10) {
					if(!map.containsKey(digit)){
						map.put(digit,1);
					} else{
						return false;
					}
				}
			}
			map.clear();
		}
		return true;
	}
	
	boolean isValidRow(char[][] box){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i < box.length; i++){
			for(int j=0; j < box[i].length; j++) {
				int digit = box[i][j]-'0';
				if(digit > 0 && digit < 10) {
					if(!map.containsKey(digit)){
						map.put(digit,1);
					} else{
						return false;
					}
				}
			}
			map.clear();
		}
		return true;
	}

	public static void main(String args[]) {
		Sudoko sudoko = new Sudoko();
		char[][] cArr = {
					 {'.','9','.','.','4','.','.','.','.'}, 
					 {'1','.','.','.','.','.','6','.','.'}, 
					 {'.','.','3','.','.','.','.','.','.'}, 
					 {'.','.','.','.','.','.','.','.','.'}, 
					 {'.','.','.','7','.','.','.','.','.'}, 
					 {'3','.','.','.','5','.','.','.','.'}, 
					 {'.','.','7','.','.','4','.','.','.'}, 
					 {'.','.','.','.','.','.','.','.','.'}, 
					 {'.','.','.','.','7','.','.','.','.'}};
				//{'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}
		
		System.out.println(sudoko.isValidSudoku(cArr));
	}
}
