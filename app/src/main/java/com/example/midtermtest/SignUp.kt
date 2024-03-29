package com.example.midtermtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp( navController: NavHostController){
    Image(
        painter = painterResource(id = R.drawable.background),
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        contentDescription = null)
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "Create Account", fontWeight = FontWeight.Bold, fontSize = 32.sp)
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Sign up to get started", fontWeight = FontWeight.Bold, color = Color.LightGray)

        Spacer(modifier = Modifier.size(30.dp))
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(10.dp))
        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(10.dp))
        var cfpassword by remember { mutableStateOf("") }
        OutlinedTextField(
            value = cfpassword,
            onValueChange = { cfpassword = it },
            label = { Text(text = "Confirm Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(35.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp)
        )
        {
            Text(text = "Sign Up" )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()){
            Text(text = "Already have an account?", textAlign = TextAlign.Center)
            TextButton(onClick = {
                navController.navigate(Screen.Login.rout)
            }) {
                Text(
                    text = "Sign In",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.LightGray)
            }
        }

    }
}

