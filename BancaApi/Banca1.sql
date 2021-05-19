alter table banca
    add total number(9) GENERATED ALWAYS as (bancaCorporativa+bancaComercial+centrosCorporativos+contactCenter+empresas+gobierno+gobiernoCentro+pyme);