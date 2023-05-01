package it.project1.account;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Integer> {
	Account findById(int id);
	List<Account> findByNickName(String nickName);
}
