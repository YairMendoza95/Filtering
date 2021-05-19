<template>
    <div>
        <navbar></navbar>
        <div class="container my-4">
            <backlog></backlog>
        </div>
    </div>
</template>

<script>
import Backlog from './components/Backlog.vue';
import Navbar from './components/layout/Navbar.vue';


export default {
    components: {
        Navbar,
        Backlog,
    }
}
</script>

<style>
body{
    margin: 0;
    padding: 0;
}
</style>
