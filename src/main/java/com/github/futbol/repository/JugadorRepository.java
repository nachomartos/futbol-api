package com.github.futbol.repository;

import com.github.futbol.entity.Jugador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
	public Page<Jugador> findByEquipoId(Long jugadorId, Pageable pageable);
}
