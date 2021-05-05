package ru.karpalov.mainbody.components;

public class Store {
    private int id;
    private String StoreNumber;
    private String RampNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreNumber() {
        return StoreNumber;
    }

    public void setStoreNumber(String storeNumber) {
        StoreNumber = storeNumber;
    }

    public String getRampNumber() {
        return RampNumber;
    }

    public void setRampNumber(String rampNumber) {
        RampNumber = rampNumber;
    }

    public Store(int id, String storeNumber, String rampNumber) {
        this.id = id;
        this.StoreNumber = storeNumber;
        this.RampNumber = rampNumber;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", StoreNumber='" + StoreNumber + '\'' +
                ", RampNumber='" + RampNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (id != store.id) return false;
        if (StoreNumber != null ? !StoreNumber.equals(store.StoreNumber) : store.StoreNumber != null) return false;
        return RampNumber != null ? RampNumber.equals(store.RampNumber) : store.RampNumber == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (StoreNumber != null ? StoreNumber.hashCode() : 0);
        result = 31 * result + (RampNumber != null ? RampNumber.hashCode() : 0);
        return result;
    }

}
