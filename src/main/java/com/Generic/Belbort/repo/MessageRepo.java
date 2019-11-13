package com.Generic.Belbort.repo;


import com.Generic.Belbort.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
