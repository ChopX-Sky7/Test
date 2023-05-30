package TestProj.Test.repos;

import TestProj.Test.entities.FormMessages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<FormMessages, Long> {
}
