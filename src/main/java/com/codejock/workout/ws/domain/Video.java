package com.codejock.workout.ws.domain;

import javax.persistence.Entity;

@Entity
public class Video extends BaseEntity {
	protected Long duration;
	protected int height;
	protected int width;
	protected String video_url;
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	
	
	

}
