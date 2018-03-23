package com.dylan.trainning.memento;

public class Client {
	
	public static MementoCaretaker taker=new MementoCaretaker();
	
	public static void main(String[] args) {
		Chess chess=new Chess("Horse","1","1");
		play(chess);
		
		chess.setX("2");
		play(chess);
		
		chess.setY("5");
		play(chess);
		
		undo(chess);
		undo(chess);
		redo(chess);
		redo(chess);
		
		chess.setLabel("Car");
		play(chess);
		
		
		
		
	}
	
	
	public static void play(Chess chess){
		taker.addMemento(chess.save());
		chess.display();
	}
	
	
	public static void undo(Chess chess){
		chess.restore(taker.back());
		chess.display();
	}
	
	public static void redo(Chess chess){
		chess.restore(taker.forward());
		chess.display();
	}

}
