package com.dylan.trainning.memento;

public class Chess {
	private String x;
	private String y;
	private String label;
	
	Chess(String label,String x, String y){
		this.label=label;
		this.x=x;
		this.y=y;
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
	
	
	public ChessMemento save(){
		return new ChessMemento(label,x,y);
	}
	
	
	public void restore(ChessMemento memento){
		
		if(memento==null)
			return;
		
		this.x=memento.getX();
		this.y=memento.getY();
		this.label=memento.getLabel();
	}
	
	
	public void display(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Chess [x=" + x + ", y=" + y + ", label=" + label + "]";
	}
	
	
	
	

}
