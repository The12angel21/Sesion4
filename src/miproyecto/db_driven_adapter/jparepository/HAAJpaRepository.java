package miproyecto.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import miproyecto.db_driven_adapter9.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long> {}
