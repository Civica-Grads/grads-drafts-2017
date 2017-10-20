package com.civica.grads.boardgames.model;


import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.enums.TypeGame;

public class MoveTestDataFactory {

	
	private Position start;
	private TypeGame type;
	

	
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
	
	public MoveRecord createMoveRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return  new MoveRecord(start, new Position(start.getX() + 1,start.getY()),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord createMoveDown(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(start, new Position(start.getX(),start.getY()+1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord createMoveUp(){
		if(type.equals(TypeGame.DRAUGHTS)){	
			return new MoveRecord(start, new Position(start.getX(),start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	

	public MoveRecord createMoveUpRight(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(start, new Position(start.getX()+1,start.getY()-1),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}

	public MoveRecord createMoveUpLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return  new MoveRecord(new Position(1,1), new Position(0,0),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	
	public MoveRecord createMoveDownLeft(){
		if(type.equals(TypeGame.DRAUGHTS)){
			return new MoveRecord(new Position(1,1), new Position(0,2),Colour.BLACK, CounterType.NORMAL, false);
		}else{
			throw new RuntimeException();
		}
	}
	
	public MoveRecord createMoveDownRight(){
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
