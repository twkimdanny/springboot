package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.model.Song;
import com.example.demo.model.SongLib;

@RestController
public class HelloController {
	
	@RequestMapping("")
	public String hello(Model model) {
		model.addAttribute("message", "alan");
		return "hello";
	}
	
	@RequestMapping("/foo")
	public String hellofoo() {
		return "hello foo";
	}
	
	@RequestMapping("/boo")
	public String helloboo() {
		return "hello boo";
	}
	
	@RequestMapping("/jm")
	public Person hellojm() {
		Person jm = new Person();
		jm.setName("JongMin");
		jm.setAge(24);
		return jm;
	}
	
	@RequestMapping("/song")
	public List<SongLib> getSongLibList() {
		
		List<SongLib> songLibList = new ArrayList<>();
		


		SongLib songLib = new SongLib();
		songLib.setTitle("오늘의 선곡");
		songLib.setDescription("저녁에 듣기 좋은 노래");
		songLib.setImage("http://www.naver.com");
		songLib.setLike(30);
		
		
//		List tagList = new ArrayList();
		List<String> tagList = new ArrayList<>();
		tagList.add("#저녁");
		tagList.add("#오늘저녁");
		tagList.add("#센치");
		tagList.add("#노래");
		
		songLib.setTagList(tagList);
		
		
		Song song = new Song();
		song.setId("111");
		song.setTitle("좋니");
		song.setGenre("발라드");
		
		songLib.setSong(song);
		
		
		
		for (int i = 0; i < 10; i++) {
			songLibList.add(songLib);	
		}
		
		return songLibList;
	}
	
	
}
