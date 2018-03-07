package com.dylan.trainning.composite;

public class TextFile extends AbstractFile {
	private String name;
	
	TextFile(String name){
		this.name=name;
	}

	@Override
	public void add(AbstractFile f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killVirus() {
		System.out.println("text file: "+name +" run kill virus");
		
	}

}
