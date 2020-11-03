package com.adp3.entity.standalone;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Entity: Store
 */
@Entity
public class Store  {

    @Id
    private String storeID;
    private String storeName;

    protected Store(){}

    private Store(Builder builder) {
        this.storeID = builder.storeID;
        this.storeName = builder.storeName;
    }

    public String getStoreID() {
        return storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeID='" + storeID + '\'' +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    //inner class contains all setters
    public static class Builder {
        private String storeID, storeName;

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder copy(Store store) {

            this.storeID = store.storeID;
            this.storeName = store.storeID;
            return this;

        }

        public Store build() {
            return new Store(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return storeID.equals(store.storeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeID);
    }
}
