package it.project1.repository;

import it.project1.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
	Optional<List<Character>> findByAccountEntityIdId(int accountId);
	Optional<Character> findByName(String name);
}
