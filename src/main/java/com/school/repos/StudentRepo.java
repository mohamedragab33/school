package com.school.repos;

import com.school.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students ,Long> {
}
