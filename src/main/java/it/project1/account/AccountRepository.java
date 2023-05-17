package it.project1.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository  extends JpaRepository<AccountDTO, Integer> {
}
