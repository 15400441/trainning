package com.dylan.trainning.memento;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MementoCaretaker {
	
	private static ArrayList<ChessMemento> list=new ArrayList<>();
	
	AtomicInteger index=new AtomicInteger(-1);
	int backCount=0;
	int forwardCount=0;
	
	
	public ChessMemento back(){
		if(index.get()<=0)
			return null;
		backCount++;
		return list.get(index.decrementAndGet());
	}
	
	
	public ChessMemento forward(){
		if(index.get()>=list.size()-1)
			return null;
		forwardCount++;
		
		if(forwardCount>backCount)
			return null;
		
		return list.get(index.incrementAndGet());
	}
	
	
	public void addMemento(ChessMemento memento){
		backCount=0;
		forwardCount=0;
		
		list.add(index.incrementAndGet(),memento);
	}
	
	
	

}
