package com.bentalla.accounts.repository;

import com.bentalla.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts , Long> {
 Optional<Accounts> findByCustomerId(Long customerId);
//
//    @Transactional
//    @Modifying
//    void deleteByCustomerId(Long customerId);
}
