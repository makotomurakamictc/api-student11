package com.example.apidemo.repository.gem;

import com.example.apidemo.entity.BookGemFire;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookGemFireRepository extends GemfireRepository<BookGemFire, String> {

    @Query("SELECT * FROM /book b WHERE b.id = $1")
    BookGemFire findBookById(String id);

}