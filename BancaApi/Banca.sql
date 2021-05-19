create table Banca (
    idBanca NUMBER(10) PRIMARY KEY,
    division VARCHAR2(30) not null,
    bancaCorporativa number(4) not null,
    bancaComercial number(4) not null,
    centrosCorporativos number(4) not null,
    contactCenter number(4) not null,
    empresas number(4) not null,
    gobierno number(4) not null,
    gobiernoCentro number(4) not null,
    pyme number(7) not null
);