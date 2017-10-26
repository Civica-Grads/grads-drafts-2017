package com.civica.grads.boardgames.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.exceptions.MoveException;
import com.civica.grads.boardgames.model.draughts.MakeMoveLogicDraughts;

public class MakeMoveLogicDraughtsTest {

	@Test(expected = MoveException.class)
	public void CheckFoInvalidMoveOutsideOfBoardonCheckValidMoveTest() throws MoveException, GameException {

		// with
		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(0, 0));
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(0);
		when(startPos.getY()).thenReturn(0);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(-1);
		when(newPos.getY()).thenReturn(0);

		// when(mockBoard.getPiece(startPos)).thenReturn(a);
		//
		// when(a.getType()).thenReturn(CounterType.NORMAL);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void CheckFoInvalidMovedBy3onXand3onYCoordinateonCheckValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(3, 1));
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(6);
		when(newPos.getY()).thenReturn(4);

		// Counter a = new Counter(Colour.BLACK);
		// when(mockBoard.getPiece(startPos)).thenReturn(a);
		//
		// when(a.getType()).thenReturn(CounterType.NORMAL);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

		// with
		// Board mockBoard = mock(Board.class);
		// when(mockBoard.getSize()).thenReturn(10);

		// AND

	}

	@Test(expected = MoveException.class)
	public void CheckForInvalidisNonDiagnalMoveonCheckValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(3, 1));
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(2);
		when(newPos.getY()).thenReturn(1);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void CheckForInvalidisNonDiagnalMoveonCheckValidMoveTest2() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(9, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(9);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(2);
		when(newPos.getY()).thenReturn(1);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void CheckForInvalidMoveDiagnolonCheckValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(3, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(3);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(6);
		when(newPos.getY()).thenReturn(4);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void CheckIllegalMoveUpofCheckValidMoveOnCheckValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(4);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void validMoveUpRightCheckIsValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(0);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void validMoveUpLeftCheckIsValidMoveTest() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(3);
		when(newPos.getY()).thenReturn(0);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test
	public void validMoveDownLeftCheckIsValidMoveTestOnWhite() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(3);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

		assertTrue(true);

	}

	@Test(expected = MoveException.class)
	public void validMoveDownLeftCheckIsValidMoveTestOnBlack() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(3);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test(expected = MoveException.class)
	public void validMoveDownRightCheckIsValidMoveTestOnBlack() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.BLACK, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

	}

	@Test
	public void validMoveDownRightCheckIsValidMoveTestOnWhite() throws MoveException, GameException {

		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		toTest.checkForValidMove();

		assertTrue(true);

	}

	@Test
	public void checkIfcounterTakenValidTest() throws GameException {
		Board mockBoard = new Board(10);
		Counter a = new Counter(Colour.WHITE, CounterType.NORMAL, 0);

		mockBoard.placePiece(a, new Position(4, 1));
		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		boolean actual = toTest.checkIfCounterTaken();
		boolean expected = false;

		assertEquals(actual, expected);

	}

	@Test
	public void checkIfcounterTakenInvalidTest() {

		// with
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(6);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		boolean actual = toTest.checkIfCounterTaken();
		boolean expected = false;

		assertEquals(actual, expected);
	}

	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterNeedsChangingTest() {

		// with
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(6);
		when(newPos.getY()).thenReturn(3);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		boolean actual = toTest.checkIfCounterTypeNeedChanging();
		boolean expected = true;

		assertEquals(actual, expected);

	}

	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterDoesNotNeedChangingTest() {
		// with
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		boolean actual = toTest.checkIfCounterTypeNeedChanging();
		boolean expected = false;

		assertEquals(actual, expected);
	}

	@Test
	public void checkcheckIfCounterTypeNeedChangingMethodWhenCounterMovceISWrongTest() {
		// with
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(9);
		when(newPos.getY()).thenReturn(1);

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		boolean actual = toTest.checkIfCounterTypeNeedChanging();
		boolean expected = false;

		assertEquals(actual, expected);
	}

	@Test
	public void createMoveRecordtest() {
		// with
		Board mockBoard = mock(Board.class);
		when(mockBoard.getSize()).thenReturn(10);

		Piece<?> a = mock(Piece.class);

		// AND
		Position startPos = mock(Position.class);
		when(startPos.getX()).thenReturn(4);
		when(startPos.getY()).thenReturn(1);

		// AND
		Position newPos = mock(Position.class);
		when(newPos.getX()).thenReturn(5);
		when(newPos.getY()).thenReturn(2);

		// WHEN

		MakeMoveLogicDraughts toTest = new MakeMoveLogicDraughts(mockBoard, startPos, newPos);

		when(mockBoard.getPiece(newPos)).thenReturn(a);
		when(a.getColour()).thenReturn(Colour.BLACK);

		MoveRecord expected = new MoveRecord(newPos, startPos, Colour.BLACK, CounterType.NORMAL, false);

		assertEquals(expected, toTest.createMoveRecord());
	}

}
