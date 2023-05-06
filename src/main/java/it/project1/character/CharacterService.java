package it.project1.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	public ResponseEntity<List<CharacterEntity>> getListOfCharacters() {
		return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
	}
	public ResponseEntity<CharacterEntity> getById(int id){
		return new ResponseEntity<>(characterRepository.findById(id).get(), HttpStatus.FOUND );
	}
}
