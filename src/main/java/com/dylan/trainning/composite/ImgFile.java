package com.dylan.trainning.composite;

public class ImgFile extends AbstractFile {
	private String name;

	ImgFile(String name) {
		this.name = name;
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
		System.out.println("img file: " + name + " run kill virus");

	}

}
