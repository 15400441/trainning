package com.dylan.trainning.composite;

import java.util.LinkedList;
import java.util.List;

public class Folder extends AbstractFile {

	private List<AbstractFile> fs=new LinkedList<AbstractFile>();
	private String name;
	
	public Folder(String name) {
		this.name=name;
	}
	
	
	@Override
	public void add(AbstractFile f) {
		// TODO Auto-generated method stub
		fs.add(f);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killVirus() {
		
		System.out.println(name+" run kill virus");
		
		fs.stream().forEach(f->{
			f.killVirus();
		});
		
	}

}
