package it.project1.service;

import it.project1.entities.Character;
import it.project1.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	public ResponseEntity<List<Character>> getListOfCharacters() {
		return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
	}
	
	public ResponseEntity<Character> getById(int id) {
		Optional<Character> optionalCharacterEntity = characterRepository.findById(id);
		if (optionalCharacterEntity.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(optionalCharacterEntity.get(), HttpStatus.FOUND);
		}
	}
	
	public ResponseEntity<List<Character>> getByAccountId(int accountId) {
		Optional<List<Character>> optionalCharacterEntityList = characterRepository.findByAccountEntityIdId(accountId);
		if (optionalCharacterEntityList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			List<Character> characterList = optionalCharacterEntityList.get();
			return new ResponseEntity<>(characterList, HttpStatus.FOUND);
		}
	}
	
	public ResponseEntity<Character> postCharacter(Character character) {
		if (character == null) {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		} else if (characterRepository.findByName(character.getName()).isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			characterRepository.save(character);
			return new ResponseEntity<>(character, HttpStatus.CREATED);
		}
	}
	
	public ResponseEntity<Character> delCharacter(int id, String password){
		Optional<Character> optionalCharacterEntity = characterRepository.findById(id);
		if (optionalCharacterEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else if (!optionalCharacterEntity.get().getAccountId().getPassword().equals(password)) {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		} else {
			characterRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	public ResponseEntity<Character> putCharacter(Character character){
		Optional<Character> optionalCharacterEntity = characterRepository.findById(character.getId());
		if (optionalCharacterEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			characterRepository.save(character);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
}
