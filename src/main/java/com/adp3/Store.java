package com.adp3;


/**
 * @author riyaad ryklief
 * desc: store class created using Builder Pattern
 */
public class Store {

    private String storeID, storeName;

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
    public static class Builder{
        private String storeID, storeName;

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder copy (Store store){

            this.storeID = store.storeID;
            this.storeName = store.storeID;
            return this;

        }

        public Store build(){
               return new Store(this);
        }
    }
}
