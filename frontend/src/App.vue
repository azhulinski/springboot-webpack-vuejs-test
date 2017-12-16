<template>
  <div id="app">

    <button class="btn btn-success" @click="getTruckRoutes()">get data</button>
    <button class="btn btn-primary">add data</button>
    <button class="btn btn-danger">clear data</button>
    <button class="btn btn-secondary">repost all</button>
    <hr>
    <table class="table table-bordered">
      <tr>
        <th scope="col">call Control</th>
        <th scope="col">Read</th>
        <th scope="col">Sound / Auto Call</th>
        <th scope="col">Truck</th>
        <th scope="col">Origin</th>
        <th scope="col">Destination</th>
        <th scope="col">Pickup</th>
        <th scope="col">DH-O</th>
        <th scope="col">DH-D</th>
        <th scope="col">F/P</th>
        <th scope="col">Length</th>
        <th scope="col">Weight</th>
        <th scope="col">Trip</th>
        <th scope="col">Alarm</th>
        <th scope="col">Actions</th>
      </tr>
    </table>
    <hr>
    <table class="table table-bordered" v-for="routes in truckRoutes">
      <tr>
        <th scope="col" v-for="(value, key) in routes">{{ key }}</th>
      </tr>
      <tr>
        <th scope="col" v-for="(value, key) in routes">{{ value }}</th>
      </tr>

    </table>


  </div>
</template>

<script>
  import axios from 'axios';

  export default {
    data: function () {
      return {
        truckRoutes: []
      }
    },
    name: 'app',
    methods: {
      getTruckRoutes() {
        axios.get('/getData')
          .then(response => {

            this.truckRoutes = response.data;
            const resData = response.data;
            for (const key in resData) {
              console.log(resData[key]);
            }
          })
          .catch(error => {
            console.log(error);
          })
      }
    },

    components: {}
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
