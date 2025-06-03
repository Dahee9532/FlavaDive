package com.example.flavadive.ui.Register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.flavadive.R
import com.example.flavadive.ui.theme.notosanskr

@Composable
fun RegisterName(navController: NavHostController) {
    val (name, setName) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "본명을 입력해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )
        TextField(
            value = name,
            onValueChange = setName,
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "홍길동") },
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )
        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("phoneNumber/$name")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}

@Composable
fun RegisterPhoneNumber(navController: NavHostController, name : String) {
    val (phoneNumber, setPhoneNumber) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "전화번호를 입력해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )

        TextField(
            value = name,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = phoneNumber,
            onValueChange = setPhoneNumber,
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "010-****-****") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )

        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("nickName/$name/$phoneNumber")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}

@Composable
fun RegisterNickName(navController: NavHostController, name: String, phoneNumber: String) {
    val (nickName, setNickName) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "사용하실 닉네임을 입력해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )

        TextField(
            value = name,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = phoneNumber,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = nickName,
            onValueChange = setNickName,
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "nick name") },
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )
        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("password/$name/$phoneNumber/$nickName")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}

@Composable
fun RegisterPassword(navController: NavHostController, name: String, phoneNumber: String, nickName: String) {
    val (passWord, setPassWord) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "비밀번호를 입력해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )

        TextField(
            value = name,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = phoneNumber,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = nickName,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = passWord,
            onValueChange = setPassWord,
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "*****") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )

        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("passwordAgain/$name/$phoneNumber/$nickName/$passWord")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}

@Composable
fun RegisterPasswordAgain(navController: NavHostController, name: String, phoneNumber: String, nickName: String, passWord: String) {
    val (passWordAgain, setPassWordAgain) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "비밀번호를 한번 더 입력해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )

        TextField(
            value = name,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = phoneNumber,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = nickName,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = passWord,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = passWordAgain,
            onValueChange = setPassWordAgain,
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "*****") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )

        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("role/$name/$phoneNumber/$nickName/$passWord/$passWordAgain")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}

@Composable
fun RegisterRole(navController: NavHostController, name: String, phoneNumber: String, nickName: String, passWord: String, passWordAgain: String) {
    val (roleType, setRoleType) = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "회원가입",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Role을 선택해주세요.",
            color = Color.Gray,
            fontSize = 25.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Light,
        )
        TextField(
            value = name,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = phoneNumber,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = nickName,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = passWordAgain,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        TextField(
            value = passWord,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            enabled = false,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
            ),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black,
                ),
            ) {
                Text("GUEST")
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black,
                ),
            ) {
                Text("HOST")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        IconButton(
            onClick = {
                navController.navigate("name")
            },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.End),
        ) {
            Image(
                painter = painterResource(R.drawable.free_icon_next_button),
                contentDescription = "next button"
            )
        }
    }
}