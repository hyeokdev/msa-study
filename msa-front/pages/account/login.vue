<template>
    <div id="wrap_login">
        <div class="border_login">
            <p class="login_text">Login</p>
            <div>
                <input type="text" placeholder="Insert ID" class="login_inp">
            </div>
            <div>
                <input type="password" placeholder="Insert Password" class="login_inp">
            </div>
            <button class="login_btn">LOGIN</button>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>
    #wrap_login {
        width: 100%;
        height: 100%;
    }
    .border_login {
        position: absolute;
        text-align: center;
        left: 40%;
        top: 30%;
        width: 300px;
        border: 2px solid lightgray;
        border-radius: 5px;
    }
    .login_text {
        font-size: 2rem;
        font-weight: 600;
        color: dodgerblue;
        margin-bottom: 50px;
    }
    .login_inp {
        border: 1px solid lightgray;
        border-radius: 5px;
        width: 80%;
        height: 30px;
        margin-bottom: 10px;
    }
    .login_btn {
        cursor: pointer;
        border: 1px solid dodgerblue;
        background-color: dodgerblue;
        color: white;
        border-radius: 5px;
        width: 80%;
        height: 30px;
        margin-bottom: 10px;
    }
</style>
