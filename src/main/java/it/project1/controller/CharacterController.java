package it.project1.controller;

import it.project1.service.CharacterService;
import it.project1.entities.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {
	@Autowired
	public CharacterService characterService;
	@GetMapping
	public ResponseEntity<Character> getById(@RequestParam int id){
		return characterService.getById(id);
	}
	@GetMapping("/find-all")
	public ResponseEntity<List<Character>> getAll() {
		return characterService.getListOfCharacters();
	}
	
	@GetMapping("/find-by-account-id")
	public ResponseEntity<List<Character>> getByAccountId(@RequestParam int accountId){
		return characterService.getByAccountId(accountId);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Character> postCharacter(@RequestBody Character character){
		return characterService.postCharacter(character);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<Character> delCharacter(@RequestParam int id, @RequestParam String password){
		return characterService.delCharacter(id, password);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Character> putCharacter(@RequestBody Character character){
		return characterService.putCharacter(character);
	}
	
}
