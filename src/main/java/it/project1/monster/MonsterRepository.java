package it.project1.monster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MonsterRepository extends JpaRepository<MonsterEntity, Integer> {
    List<MonsterEntity> findAll();
    Optional<MonsterEntity> findById(Long id);
    MonsterEntity save(MonsterEntity monster);
    void delete(MonsterEntity monster);
}
