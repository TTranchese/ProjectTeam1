package it.project1.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CharacterService {
	@Autowired
	private CharacterRepository characterRepository;
	
	public List<CharacterEntity> getListOfCharacters() {
		return characterRepository.findAll();
	}
}
