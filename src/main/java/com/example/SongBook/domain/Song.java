//Java class for forming a song object

package com.example.SongBook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String title, lyrics;
	
	
	
	
	public Song(Long id, String title, String lyrics) {
		super();
		Id = id;
		this.title = title;
		this.lyrics = lyrics;
	}
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}


	@Override
	public String toString() {
		return "Song [Id=" + Id + ", title=" + title + ", lyrics=" + lyrics + "]";
	}
	
	
	
	
	
}
