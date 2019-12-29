<template>
  <div id="wrap_join">
      <p class="join_text">Join</p>
      <input type="text" placeholder="Insert ID" class="join_inp">
      <input type="password" placeholder="Insert Password" class="join_inp">
      <input type="password" placeholder="Insert Password Check" class="join_inp">
      <button class="join_btn">JOIN</button>
  </div>
</template>

<script>
export default {

}
</script>

<style>
    #wrap_join {
        position: absolute;
        top: 20%;
        left: 40%;
        border: 2px solid lightgray;
        border-radius: 5px;
        padding: 2em 2em 2em 2em;
        text-align: center;
    }
    .join_text {
        font-size: 24px;
        font-weight: 600;
        color: dodgerblue;
        margin-bottom: 40px
    }
    .join_inp {
        display: block;
        margin-bottom: 10px;
        border: 1px solid lightgray;
        border-radius: 5px;
        width: 100%;
        height: 30px;
    }
    .join_btn {
        width: 100%;
        background-color: dodgerblue;
        color: white;
        border: 1px solid dodgerblue;
        border-radius: 5px;
        height: 30px;
    }
</style>
