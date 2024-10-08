package com.example.shop4.repository;

import com.example.shop4.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface GoodsRepository extends JpaRepository<Goods, Long> {
}
