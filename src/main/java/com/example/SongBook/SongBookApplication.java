package com.example.SongBook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.SongBook.SongBookApplication;
import com.example.SongBook.domain.Song;
import com.example.SongBook.domain.SongRepository;

@SpringBootApplication
public class SongBookApplication {
	private static final Logger log = LoggerFactory.getLogger(SongBookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SongBookApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(SongRepository repository) {
		
		return (args) -> {
			
			
		log.info("Save a song");
		repository.save(new Song("Helan Gar", "jallutahti"));
		repository.save(new Song("Koskenkorva", "koskenkorvaaaaaa"));
		repository.save(new Song("Lammaslaulu", "lampaita"));
		
		log.info("Fetch songs:");
		for (Song song : repository.findAll()) {
			log.info(song.toString());
		}
		
		};
	}

}
