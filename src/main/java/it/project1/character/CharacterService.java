package it.project1.character;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharacterService {
	private CharacterRepository characterRepository;
	
	public Optional<CharacterEntity> getByCharacterId(Integer id){
		return characterRepository.findById(id);
	}
}
