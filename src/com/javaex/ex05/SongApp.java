package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song a = new Song();
		a.setArtist("아이유");
		a.setTitle("좋은날");
		a.setAlbum("Real");
		a.setYear(2010);
		a.setTrack(3);
		a.setComposer("이민수");
		
		Song b = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");

		Song c = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}

}
