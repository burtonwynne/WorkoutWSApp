package com.codejock.scratchboard.ws.domain;

import java.net.URL;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Exercise extends BaseEntity{
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="video_id")
	protected Video video;
	protected int duration;
	
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
}
