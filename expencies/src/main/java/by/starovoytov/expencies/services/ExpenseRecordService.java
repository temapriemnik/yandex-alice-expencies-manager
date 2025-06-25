package by.starovoytov.expencies.services;

import by.starovoytov.expencies.models.ExpenseRecord;
import by.starovoytov.expencies.repositories.ExpenseRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseRecordService {

    private final ExpenseRecordRepository expenseRecordRepository;

    @Transactional
    public ExpenseRecord create(String userId, BigDecimal amount, String category) {
        ExpenseRecord record = ExpenseRecord.builder()
                .userId(userId)
                .amount(amount)
                .category(category)
                .build();
        
        return expenseRecordRepository.save(record);
    }

    public List<ExpenseRecord> getAllByUserId(String userId) {
        return expenseRecordRepository.findByUserId(userId);
    }

    public List<ExpenseRecord> getByUserIdAndCategory(String userId, String category) {
        return expenseRecordRepository.findByUserIdAndCategory(userId, category);
    }

    @Transactional
    public void delete(Long id) {
        expenseRecordRepository.deleteById(id);
    }
}