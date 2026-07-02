package com.example.lab1kotlincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.lab1kotlincompose.ui.theme.Lab1KotlinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1KotlinComposeTheme {
                SmallTopAppBarExample(modifier = Modifier)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBarExample(modifier: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.hsv(174f, 1f, 0.67f),
                    titleContentColor = Color.White,
                ),
                title = { Text("Example 1: Kotlin + Compose") }
            )
        },
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "My image",
                modifier = Modifier.size(120.dp)
            )

            Spacer(Modifier.height(16.dp))


            Spacer(Modifier.height(16.dp))

            Row {
                MyButton()
                Spacer(modifier = Modifier.width(100.dp))
                MyButton()
            }

            Spacer(Modifier.height(16.dp))

            Row {
                MyButton()
                Spacer(modifier = Modifier.width(100.dp))
                MyButton()
            }

            Spacer(Modifier.height(16.dp))

            EmailInputField()

        }
    }
}

@Composable
fun MyButton(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(0.dp),
        modifier = Modifier.size(80.dp, 40.dp),
        contentPadding = PaddingValues(0.dp)
    ) { Text("BUTTON")}
}

@Composable
fun EmailInputField() {
    var email by remember { mutableStateOf("") }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Email")
        TextField(
            value = email,
            onValueChange = { email = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFFFF1493), // Pink
                unfocusedIndicatorColor = Color(0xFFFF1493)
            ),
            modifier = Modifier.weight(1f).padding(start = 16.dp)
        )
    }
}
