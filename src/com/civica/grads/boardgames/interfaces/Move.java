package com.civica.grads.boardgames.interfaces;

import com.civica.grads.boardgames.model.Position;

public interface Move {

	Position getPositionStart();

	Position getPositionFinish();

}