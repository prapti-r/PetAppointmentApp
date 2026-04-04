package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF7F8FA)).padding(24.dp)) {
        Text("Key Features", fontSize = 26.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(24.dp))
        androidx.compose.foundation.lazy.grid.LazyVerticalGrid(
            columns = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { HomeCard("Daily Check", "😊", Color(0xFFE3F2FD)) }
            item { HomeCard("Practices", "🧘", Color(0xFFE0F2F1)) }
            item { HomeCard("Journal", "✍️", Color(0xFFFFF3E0)) }
            item { HomeCard("Stats", "📈", Color(0xFFFCE4EC)) }
        }
    }
}

@Composable
fun HomeCard(title: String, icon: String, bgColor: Color) {
    Box(modifier = Modifier.aspectRatio(1f).background(bgColor, RoundedCornerShape(24.dp)).padding(20.dp)) {
        Column {
            Text(icon, fontSize = 28.sp)
            Spacer(modifier = Modifier.height(12.dp))
            Text(title, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() { HomeScreen() }