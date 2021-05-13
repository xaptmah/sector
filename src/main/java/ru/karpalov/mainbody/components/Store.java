package ru.karpalov.mainbody.components;

public class Store {
    private int id;
    private String storeNumber;
    private String rampNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        storeNumber = storeNumber;
    }

    public String getRampNumber() {
        return rampNumber;
    }

    public void setRampNumber(String rampNumber) {
        rampNumber = rampNumber;
    }

    public Store(String storeNumber, String rampNumber) {
        this.storeNumber = storeNumber;
        this.rampNumber = rampNumber;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", StoreNumber='" + storeNumber + '\'' +
                ", RampNumber='" + rampNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (id != store.id) return false;
        if (storeNumber != null ? !storeNumber.equals(store.storeNumber) : store.storeNumber != null) return false;
        return rampNumber != null ? rampNumber.equals(store.rampNumber) : store.rampNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (storeNumber != null ? storeNumber.hashCode() : 0);
        result = 31 * result + (rampNumber != null ? rampNumber.hashCode() : 0);
        return result;
    }

}
