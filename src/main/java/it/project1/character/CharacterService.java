package it.project1.character;

import it.project1.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	
	public ResponseEntity<List<CharacterEntity>> getListOfCharacters() {
		return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
	}
	public ResponseEntity<CharacterEntity> getById(int id){
		Optional<CharacterEntity> optionalCharacterEntity = characterRepository.findById(id);
		if (optionalCharacterEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(optionalCharacterEntity.get(), HttpStatus.FOUND);
		}
	}
	public ResponseEntity<List<CharacterEntity>> getByAccountId(int accountId){
		Optional<List<CharacterEntity>> optionalCharacterEntityList = characterRepository.findByAccountEntityIdId(accountId);
		if (optionalCharacterEntityList.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			List<CharacterEntity> characterEntityList = optionalCharacterEntityList.get();
			return new ResponseEntity<>(characterEntityList, HttpStatus.FOUND);
		}
	}
}
