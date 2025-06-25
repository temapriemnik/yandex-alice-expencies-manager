package by.starovoytov.expencies.repositories;

import by.starovoytov.expencies.models.ExpenseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExpenseRecordRepository extends JpaRepository<ExpenseRecord, Long> {
    List<ExpenseRecord> findByUserId(String userId);
    List<ExpenseRecord> findByUserIdAndCategory(String userId, String category);
}