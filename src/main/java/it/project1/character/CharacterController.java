package it.project1.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	@GetMapping
	public ResponseEntity<CharacterEntity> getById(@RequestParam int id){
		return characterService.getById(id);
	}
	@GetMapping("/find-all")
	public ResponseEntity<List<CharacterEntity>> getAll() {
		return characterService.getListOfCharacters();
	}
	
	@GetMapping("/find-by-account-id")
	public ResponseEntity<List<CharacterEntity>> getByAccountId(@RequestParam int accountId){
		return characterService.getByAccountId(accountId);
	}
	
}
