package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoodTrackingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFBFBFF))
            .padding(24.dp)
    ) {
        // --- Header ---
        Text("How are you feeling?", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Text("Select your mood today", color = Color.Gray)

        Spacer(modifier = Modifier.height(32.dp))

        // --- Mood Selection Grid ---
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            MoodOption("😊", "Happy")
            MoodOption("😐", "Neutral")
            MoodOption("😢", "Sad")
            MoodOption("😤", "Stressed")
        }

        Spacer(modifier = Modifier.height(40.dp))

        // --- Recent Entries ---
        Text("Recent Entries", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(3) {
                MoodHistoryItem()
            }
        }
    }
}

@Composable
fun MoodOption(emoji: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            modifier = Modifier.size(64.dp),
            shadowElevation = 2.dp
        ) {
            Box(contentAlignment = Alignment.Center) { Text(emoji, fontSize = 24.sp) }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(label, fontSize = 12.sp)
    }
}

@Composable
fun MoodHistoryItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(16.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("😊", fontSize = 24.sp)
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text("Happy", fontWeight = FontWeight.Bold)
            Text("Today, 9:00 AM", fontSize = 12.sp, color = Color.Gray)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MoodPreview() { MoodTrackingScreen() }