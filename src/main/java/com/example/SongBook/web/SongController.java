package com.example.SongBook.web;

import java.util.List;
import com.example.SongBook.domain.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SongController {
	
	@Autowired
	private SongRepository repository;
	
	@RequestMapping(value="/songlist")
	public String songList(Model model) {
		model.addAttribute("songs", repository.findAll());
		return "songlist";
	}
}
