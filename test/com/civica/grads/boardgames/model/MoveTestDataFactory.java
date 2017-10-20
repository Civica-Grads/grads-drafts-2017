package com.civica.grads.boardgames.model;


import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.enums.TypeGame;

public class MoveTestDataFactory {

	
	private Position start;
	private TypeGame type;
	
	//private MoveRecord left;
	private MoveRecord right;
	private MoveRecord down;
	private MoveRecord up;
	private MoveRecord upRight;
	private MoveRecord upLeft;
	private MoveRecord downLeft;
	private MoveRecord downRight;
	
	public MoveTestDataFactory(Position start, TypeGame type){
		this.start = start;
		this.type = type;
		
	}
	
	
	public MoveRecord creatMoveLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(start, new Position(start.getX()-1,start.getY()),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord moveRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return  new MoveRecord(start, new Position(start.getX() + 1,start.getY()),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord moveDown(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(start, new Position(start.getX(),start.getY()+1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord moveUp(){
		if(type.equals(TypeGame.DRAUGHTS)){	
			return new MoveRecord(start, new Position(start.getX(),start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	

	public MoveRecord moveUpRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(start, new Position(start.getX()+1,start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}

	public MoveRecord moveUpLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return  new MoveRecord(new Position(1,1), new Position(0,0),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	
	public MoveRecord moveDownLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(new Position(1,1), new Position(0,2),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord moveDownRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(new Position(1,1), new Position(2,2),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
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
