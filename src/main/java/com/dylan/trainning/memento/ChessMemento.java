package com.dylan.trainning.memento;

public class ChessMemento {
	
	private String x;
	private String y;
	private String label;
	
	
	
	
	public ChessMemento(String label, String x, String y) {
		super();
		this.x = x;
		this.y = y;
		this.label = label;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
