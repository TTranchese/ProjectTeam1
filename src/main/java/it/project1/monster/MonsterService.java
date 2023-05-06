package it.project1.monster;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonsterService {
    @Autowired
    public MonsterRepository monsterRepository;

    public List<MonsterEntity> getAllMonsters() {
        return monsterRepository.findAll();
    }

    public MonsterEntity getMonsterById(Long id) {
        return monsterRepository.findById(id).orElseThrow(() -> new RuntimeException("Monster not found"));
    }

    public MonsterEntity createOrUpdateMonster(MonsterEntity monster) {
        return monsterRepository.save(monster);
    }

    public void deleteMonster(Long id) {
        MonsterEntity monster = getMonsterById(id);
        monsterRepository.delete(monster);
    }

}
