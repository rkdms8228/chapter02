package com.javaex.ex05;

import java.util.Objects;

public class Song {

	//필드
	private String artist;
	private String title;
	private String album;
	private int year;
	private int track;
	private String composer;
	
	//생성자
	public Song() { //메모리에 올리는 일
		System.out.println("Song()");
	}
	
	public Song(String artist, String title, String album, int year, int track, String composer) {
		//메모리에 올리는 일
		this.artist = artist;
		this.title = title;
		this.album = album;	
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	//메소드-gs
	public void setArtist(String a) {
		this.artist = a;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setAlbum(String ab) {
		this.album = ab;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setTrack(int t) {
		this.track = t;
	}
	
	public void setComposer(String c) {
		this.composer = c;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTack() {
		return track;
	}
	
	public String getComposer() {
		return composer;
	}
	
	//메소드-일반
	@Override
	public int hashCode() {
		return Objects.hash(album, artist, composer, title, track, year);
	}

	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}

}
