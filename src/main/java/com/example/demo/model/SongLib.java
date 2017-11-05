package com.example.demo.model;

import java.util.List;

public class SongLib {
	String title;
	String description;
	String image;
	int like;
	List<String> tagList;
	Song song;
	
	public List<String> getTagList() {
		return tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}

	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	
	
}
