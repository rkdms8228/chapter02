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
		
		Song b = new Song();
		b.setArtist("BIGBANG");
		b.setTitle("거짓말");
		b.setAlbum("Always");
		b.setYear(2007);
		b.setTrack(2);
		b.setComposer("G-DRAGON");
		
		Song c = new Song();
		c.setArtist("버스커버스커");
		c.setTitle("벚꽃엔딩");
		c.setAlbum("버스커버스커1집");
		c.setYear(2012);
		c.setTrack(4);
		c.setComposer("장범준");
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}

}
