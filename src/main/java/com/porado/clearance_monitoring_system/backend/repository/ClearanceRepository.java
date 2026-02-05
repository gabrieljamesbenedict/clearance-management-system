/**
 * A Clearance repository class that abstracts the connection between Spring and the database.
 * Responsible for creating SQL scripts to communicate with Postgres.
 */

package com.porado.clearance_monitoring_system.backend.repository;

import com.porado.clearance_monitoring_system.backend.model.Clearance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClearanceRepository extends JpaRepository<Clearance, Long> {
}
