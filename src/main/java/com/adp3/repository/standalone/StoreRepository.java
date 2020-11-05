package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreRepository - extends member methods of parent "IRepository"
 */
@Repository
public interface StoreRepository extends JpaRepository<Store, String> {
}