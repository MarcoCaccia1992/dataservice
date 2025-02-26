package it.gft.simpleapplication.dataservice.repository;

import it.gft.simpleapplication.dataservice.dto.AccountDataDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDataRepository extends JpaRepository<AccountDataDto, Long> {
}
