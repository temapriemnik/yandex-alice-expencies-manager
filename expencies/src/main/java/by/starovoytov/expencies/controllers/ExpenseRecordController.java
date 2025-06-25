package by.starovoytov.expencies.controllers;

import by.starovoytov.expencies.models.ExpenseRecord;
import by.starovoytov.expencies.services.ExpenseRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/expenses")
public class ExpenseRecordController {

    private final ExpenseRecordService expenseRecordService;

    @PostMapping("/{userId}/{amount}/{category}")
    public ResponseEntity<ExpenseRecord> create(
            @PathVariable String userId,
            @PathVariable BigDecimal amount,
            @PathVariable String category) {
        
        ExpenseRecord record = expenseRecordService.create(userId, amount, category);
        return ResponseEntity.ok(record);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<ExpenseRecord>> getAllByUserId(@PathVariable String userId) {
        List<ExpenseRecord> records = expenseRecordService.getAllByUserId(userId);
        return ResponseEntity.ok(records);
    }

    @GetMapping("/{userId}/{category}")
    public ResponseEntity<List<ExpenseRecord>> getByUserIdAndCategory(
            @PathVariable String userId,
            @PathVariable String category) {
        
        List<ExpenseRecord> records = expenseRecordService.getByUserIdAndCategory(userId, category);
        return ResponseEntity.ok(records);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        expenseRecordService.delete(id);
        return ResponseEntity.noContent().build();
    }
}