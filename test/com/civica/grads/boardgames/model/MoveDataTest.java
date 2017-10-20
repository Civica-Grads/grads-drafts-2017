package com.civica.grads.boardgames.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.enums.TypeGame;

public class MoveDataTest {

	
	private Position start;
	private TypeGame type;
	
	private MoveRecord left;
	private MoveRecord right;
	private MoveRecord down;
	private MoveRecord up;
	private MoveRecord upRight;
	private MoveRecord upLeft;
	private MoveRecord downLeft;
	private MoveRecord downRight;
	
	public MoveDataTest(Position start, TypeGame type){
		this.start = start;
		this.type = type;
		
	}
	
	
	public void moveLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.left = new MoveRecord(start, new Position(start.getX()-1,start.getY()),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	
	public void moveRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.right = new MoveRecord(start, new Position(start.getX() + 1,start.getY()),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	
	public void moveDown(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.down = new MoveRecord(start, new Position(start.getX(),start.getY()+1),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	
	public void moveUp(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.up = new MoveRecord(start, new Position(start.getX(),start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	

	public void moveUpRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.upRight = new MoveRecord(start, new Position(start.getX()+1,start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}
	}

	public void moveUpLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.upLeft = new MoveRecord(new Position(1,1), new Position(0,0),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	
	
	public void moveDownLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.downLeft = new MoveRecord(new Position(1,1), new Position(0,2),Colour.BLACK, CounterType.NORMAL, false);
		}
	}
	
	public void moveDownRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			this.downRight = new MoveRecord(new Position(1,1), new Position(2,2),Colour.BLACK, CounterType.NORMAL, false);
		}
	}


//	public void moveIllegalRight(){
//		if(type.equals(TypeGame.DRAUGHTS)){
//			this.downRight = new MoveRecord(new Position(1,1), new Position(2,2),Colour.BLACK, CounterType.NORMAL, false);
//		}
//	}
//	
//	private MoveRecord illegalRight ;
//	
//	@Before
//	public void createIllgealRightData(int width){
//		this.illegalRight =  new MoveRecord(new Position(width,2), new Position(width+1,2),Colour.BLACK, CounterType.NORMAL, false);
//	}
}
