<template>
    <div class="card">
        <div class="card-header">
            <h6 class="text-center">SEGUIMIENTO DE BACKLOG POR DIVISIÓN (CLIENTES)</h6>
        </div>
        <div class="card-body">
            <banca></banca>
        </div>
    </div>
</template>

<script>
import Banca from './Banca.vue';

export default {
    components: { 
        Banca,
    },
}
</script>

<style scoped>
.card-header {
    background:#072146;
    color:#FFFFFF;
}
</style>
