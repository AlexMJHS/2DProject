package game.controller;

import java.awt.Color;

import game.model.Game;
import game.view.GameFrame;

public class My2DController
{
	private Game [][] myGames;
	private GameFrame baseFrame;
	
	public My2DController()
	{
		myGames = new Games[5][5];
		setupArray();
		baseFrame = new GameFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myGames.length; row++)
		{
			for(int col = 0; col < myGames[0.length; col++)
			{
				myGames[row][col] = new Game();
				if(col % 2 == 0)
				{
					myGames[row][col].setNumberOfDisks(col + 3);
				}
				else
				{
					myGames[row][col].setGameRating(Color.GREEN);
				}
			}
		}
	}
	
	public Game [][] getMyGames()
	{
		return myGames;
	}
}
