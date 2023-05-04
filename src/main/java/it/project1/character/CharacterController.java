package it.project1.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class CharacterController {
	@Autowired
	public CharacterService characterService;
	@GetMapping("/findAll")
	public Collection<CharacterEntity> getAll() {
		return characterService.getListOfCharacters();
	}
}
