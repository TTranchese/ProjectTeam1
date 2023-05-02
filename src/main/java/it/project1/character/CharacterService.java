package it.project1.character;

import it.project1.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	public Optional<CharacterEntity> getByCharacterId(Integer id) {
		return characterRepository.findById(id);
	}
	public List<CharacterEntity> getListOfCharacters(){
		return characterRepository.findAll();
	}
}
