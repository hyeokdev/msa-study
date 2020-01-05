<template>
    <div id="wrap_login">
        <div class="border_login">
            <p class="login_text">Login</p>
            <el-form :model="loginForm">
                <el-form-item>
                    <el-input type="text" v-model="loginForm.username" placeholder="Insert ID" class="login_inp"/>
                </el-form-item>
                <el-form-item>
                    <el-input type="password" v-model="loginForm.password" placeholder="Insert Password" class="login_inp"/>
                </el-form-item>
            </el-form>
            <el-button type="primary">LOGIN</el-button>
            <div>
                <el-button type="text" @click="dialogVisible = true">회원가입</el-button>
            </div>
            <el-dialog
                title="회원가입"
                :visible.sync="dialogVisible"
                width="30%"
                center
            >
                <el-form label-width="120px" :model="joinForm">
                    <el-form-item label="아이디">
                        <el-input type="text" v-model="joinForm.username" placeholder="사용할 아이디를 입력해주세요." class="join_inp"/>
                    </el-form-item>
                    <el-form-item label="비밀번호">
                        <el-input type="password" v-model="joinForm.password" placeholder="사용할 비밀번호를 입력해주세요." class="join_inp"/>
                    </el-form-item>
                    <el-form-item label="비밀번호 확인">
                        <el-input type="password" v-model="joinForm.passwordChk" placeholder="비밀번호를 한번 더 입력해주세요." class="join_inp"/>
                    </el-form-item>
                    <el-form-item label="닉네임">
                        <el-input type="text" v-model="joinForm.nickname" placeholder="사용할 닉네임을 입력해주세요." class="join_inp"/>
                    </el-form-item>
                </el-form>
                <span slot="footer" class="dialog-footer">
                    <el-button type="primary" @click="dialogVisible = false">가입</el-button>
                    <el-button @click="dialogVisible = false">취소</el-button>
                </span>
            </el-dialog>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            dialogVisible: false,
            loginForm: {
                username: '',
                password: ''
            },
            joinForm: {
                username: '',
                password: '',
                passwordChk: '',
                nickname: ''
            }
        }
    }
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
        padding: 1em;
    }
    .login_text {
        font-size: 2rem;
        font-weight: 600;
        color: dodgerblue;
        margin-bottom: 40px;
    }
    .login_inp {
        width: 80%;
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
    .join_inp {
        width: 70%;
        float: left;
    }
</style>
