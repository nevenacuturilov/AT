package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
