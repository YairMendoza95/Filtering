<template>
    <div class="container">
        <div class="row">
            <div class="col-4">
                <b-input-group size="sm" class="mt-3">
                    <span class="sr-only">Buscar&nbsp;</span>
                    <b-form-input placeholder="Escriba su búsqueda" size="sm" v-model="search"></b-form-input>
                    <b-input-group-append>
                        <b-button variant="" squared>Buscar</b-button>
                    </b-input-group-append>
                </b-input-group>
            </div>
        </div>
        <div class="mt-3">
            <b-table :items="items" :fields="fields" :search="search" hover striped responsive>
                <template #thead-top="data">
                    <b-tr>
                        <b-th><span class="sr-only">{{ data.label }}</span></b-th>
                        <b-th colspan="8">Banca</b-th>
                        <b-th>&nbsp;</b-th>
                    </b-tr>
                </template>

                <template #cell(division)="data">{{ data.value }}</template>

                <template #cell(bancaCorporativa)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(bancaComercial)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(centrosCorporativos)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(contactCenter)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(empresas)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(gobierno)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(gobiernoCentro)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(pyme)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>

                <template #cell(total)="data">
                    <p>{{ data.value }}</p>
                    <b-button squared class="btn-details">Ver detalles</b-button>
                </template>
            </b-table>
        </div>
    </div>
</template>

<script>

export default {
    data(){
        return {
            search: '',
            fields: [
                {
                    key:"division",
                    label:"Division",
                },
                {
                    key:"bancaCorporativa",
                    label:"Banca Corporativa",
                },
                {
                    key:"bancaComercial",
                    label:"Banca Comercial",
                },
                {
                    key:"centrosCorporativos",
                    label:"Centros Corporativos",
                },
                {
                    key:"contactCenter",
                    label:"Contact Center",
                },
                {
                    key:"empresas",
                    label:"Empresas",
                },
                {
                    key:"gobierno",
                    label:"Gobieno",
                },
                {
                    key:"gobiernoCentro",
                    label:"Gobierno Centro",
                },
                {
                    key:"pyme",
                    label:"PyME",
                },
                {
                    key:"total",
                    label:"Total",
                },
            ],
            bancas: []
        }
    },
    created(){
        this.$http.get("banca")
            .then(res => res.json())
            .then(resJson => this.bancas = resJson);
    },
    computed: {
        items() {
            return this.search ? this.bancas.filter(item => item.division.toLowerCase().includes(this.search)) : this.bancas;
        }
    }
}
</script>

<style>
table{
    border:1px solid #FFFFFF;
}

thead{
    background-color: #004481;
    border:1px solid #FFFFFF;
    color: #FFFFFF;
}

tr{
    text-align: center;
}


td, th{
    border:1px solid #FFFFFF;
    width: 10%;
}

.btn-details{
    background-color: #004481;
    color: #FFFFFF;
    font-size: 15px;
    margin-top: -9px;
}

.btn-details:hover{
    background:#072146;
    color:#FFFFFF;
}
.table-striped > tbody > tr:nth-child(2n+1) > td, .table-striped > tbody > tr:nth-child(2n+1) > th {
    background-color: #D4EDFC;
}

@media (max-width:991px) {
    input{
        width: 100%;
    }
}
</style>
