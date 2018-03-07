package com.dylan.trainning.composite;

public class Client {
	
	public static void main(String[] args) {
		AbstractFile f1,f2,f3,f4,f5,f6,f7,f8;
		
		f1=new TextFile("spring.txt");
		f2=new TextFile("apache.txt");
		
		f3=new ImgFile("apple.jpg");
		f4=new ImgFile("orange.jpg");
		
		f5=new Folder("my_book");
		f6=new Folder("my_img");
		
		f7=new Folder("document");
		
		f8=new ImgFile("document.jpg");
		
		f5.add(f1);
		f5.add(f2);
		
		f6.add(f3);
		f6.add(f4);
		
		f7.add(f8);
		f7.add(f5);
		f7.add(f6);
		
		
		
		f7.killVirus();
		
		
		
	}

}
