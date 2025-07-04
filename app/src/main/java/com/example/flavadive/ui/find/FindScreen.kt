package com.example.flavadive.ui.find

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flavadive.R
import com.example.flavadive.ui.theme.notosanskr

@Composable
fun FindIdScreen(navController: NavController, findViewModel: FindViewModel) {
    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "아이디 찾기",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        TextField(
            value = findViewModel.phoneNumber,
            onValueChange = { findViewModel.phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "휴대전화번호 입력 ('-'제외)") },
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )
        TextField(
            value = findViewModel.phoneNumber,
            onValueChange = { findViewModel.phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "인증번호 입력") },
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
                navController.navigate("login")
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
fun FindPwdScreen(navController: NavController, findViewModel: FindViewModel) {
    Column(
        modifier = Modifier.padding(horizontal = 25.dp),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "비밀번호 찾기",
            fontSize = 30.sp,
            fontFamily = notosanskr,
            fontWeight = FontWeight.Normal,
        )
        TextField(
            value = findViewModel.phoneNumber,
            onValueChange = { findViewModel.phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "아이디") },
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent, // 배경 투명
                unfocusedContainerColor = Color.Transparent, // 포커스가 없을 때 배경 투명
                disabledContainerColor = Color.Transparent, // 비활성화 상태일 때 배경 투명
                focusedIndicatorColor = Color.Black, // 포커스 상태일 때 라인 색상
                unfocusedIndicatorColor = Color.Gray, // 포커스가 없을 때 라인 색상
            ),
        )
        TextField(
            value = findViewModel.phoneNumber,
            onValueChange = { findViewModel.phoneNumber = it },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "이름") },
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
                navController.navigate("login")
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
