package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setArtist(String a) {
		artist = a;
	}
	
	public void setAlbum(String ab) {
		album = ab;
	}
	
	public void setComposer(String c) {
		composer = c;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public void setTrack(int t) {
		track = t;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTack() {
		return track;
	}
	
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
	
}
