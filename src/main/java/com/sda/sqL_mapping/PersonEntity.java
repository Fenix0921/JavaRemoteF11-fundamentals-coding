package com.sda.sqL_mapping;

import java.util.List;
import java.util.Objects;

public class PersonEntity {
    private Long id; // id is null - it's in memory object, if id is not null - it means object was persisted
    private String name;
    private String surname;
    private AddressEntity address;
    private List<CarEntity> cars;

    public PersonEntity(String name, String surname, AddressEntity address, List<CarEntity> cars) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.cars = cars;
    }

    public PersonEntity() {
    }

    public PersonEntity(Long id, String name, String surname, AddressEntity address, List<CarEntity> cars) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", cars=" + cars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(address, that.address) && Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, address, cars);
    }

}
