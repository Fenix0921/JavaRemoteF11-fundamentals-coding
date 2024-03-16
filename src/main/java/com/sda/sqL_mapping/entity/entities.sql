CREATE TABLE wrpracti_bookinfo.PersonAddresses (
       city varchar(100) NOT NULL,
       street varchar(100) NULL,
       flat_number INTEGER NULL,
       zip_code varchar(50) NOT NULL,
       id DECIMAL NOT NULL,
       CONSTRAINT Addresses_pk PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE wrpracti_bookinfo.cars (
                                        id DECIMAL NOT NULL,
                                        brand varchar(100) NOT NULL,
                                        model varchar(100) NOT NULL,
                                        color varchar(50) NOT NULL,
                                        CONSTRAINT cars_pk PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE wrpracti_bookinfo.Persons_entities (
                                                    id BIGINT NOT NULL,
                                                    name varchar(100) NOT NULL,
                                                    surname varchar(100) NOT NULL,
                                                    address_id DECIMAL NULL,
                                                    CONSTRAINT Persons_pk PRIMARY KEY (id),
                                                    CONSTRAINT Persons_person_addresses_FK FOREIGN KEY (address_id) REFERENCES wrpracti_bookinfo.person_addresses(id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE wrpracti_bookinfo.persons_cars (
                                                person_id BIGINT NOT NULL,
                                                car_id DECIMAL NOT NULL,
                                                CONSTRAINT persons_cars_pk PRIMARY KEY (person_id,car_id),
    CONSTRAINT persons_cars_Persons_entities_FK FOREIGN KEY (person_id) REFERENCES wrpracti_bookinfo.Persons_entities(id),
    CONSTRAINT persons_cars_cars_FK FOREIGN KEY (car_id) REFERENCES wrpracti_bookinfo.cars(id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;