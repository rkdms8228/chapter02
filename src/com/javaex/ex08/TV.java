package com.javaex.ex08;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {
	}
	
	public TV(boolean power) {
		this.power = power;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드-gs
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}

	//메소드-일반
	public void channel(int channel) {
		
		if(0<channel && channel<256) {
			
		}else {
			channel = 0;
		}
		
	}
	
	public void volume(int volume) {
		
		if(0<=volume && volume<=100) {
			
		}else if(volume>100) {
			volume = 100;
		}else {
			volume = 0;
		}
		
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(boolean up) {
		if(up == true) {
			channel = this.channel+1;
		} else {
			channel = this.channel-1;
		}
	}
	
	public void volume(boolean up) {
		if(up == true) {
			volume = this.volume+1;
		} else {
			volume = this.volume-1;
		}
	}
	
	public void status() {
		System.out.print("채널: "+channel+"\t");
		System.out.print("볼륨: "+volume+"\t");
		System.out.println("전원: "+power);
		System.out.println();
	}
	
}
