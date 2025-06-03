package com.example.flavadive.ui.Login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.flavadive.R

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.padding(35.dp)
    ) {
        Spacer(modifier = Modifier.height(190.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "FlavaDive",
            fontSize = 35.sp,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic,
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "아이디") },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "비밀번호") },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            )
        ) {
            Text("로그인")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = "아이디 찾기",
                    color = Color.Black
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = "비밀번호 찾기",
                    color = Color.Black
                )
            }
            TextButton(
                onClick = {
                    navController.navigate("name")
                },
            ) {
                Text(
                    text = "회원가입",
                    color = Color.Black
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(R.drawable.kakao_login_large_narrow),
                contentDescription = null,
                modifier = Modifier.width(150.dp),
//                contentScale = ContentScale.Crop,
            )
            Image(
                painter = painterResource(R.drawable.android_neutral_sq_3x),
                contentDescription = null,
                modifier = Modifier.width(150.dp),
//                contentScale = ContentScale.Crop,
            )
        }
    }
}