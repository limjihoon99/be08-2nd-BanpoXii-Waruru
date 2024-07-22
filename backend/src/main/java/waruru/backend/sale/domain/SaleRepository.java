package waruru.backend.sale.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("select count(b) from Review b where b.saleNo.no = :sale_no")
    Integer getReviewCount(@Param("sale_no") Long saleNo);
}
