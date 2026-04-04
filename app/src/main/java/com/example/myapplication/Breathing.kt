package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BreathingScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF0F4FF)).padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(250.dp).background(Color(0xFFB2A4FF).copy(0.2f), CircleShape)
        ) {
            Surface(shape = CircleShape, color = Color(0xFFB2A4FF), modifier = Modifier.size(120.dp)) {
                Box(contentAlignment = Alignment.Center) {
                    Text("Breath In", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text("02:45", fontSize = 24.sp, fontWeight = FontWeight.Light)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BreathingPreview() { BreathingScreen() }