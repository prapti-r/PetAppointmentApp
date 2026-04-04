package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExercisesScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Box(
            modifier = Modifier.fillMaxWidth().height(220.dp)
                .background(Brush.verticalGradient(listOf(Color(0xFFB2A4FF), Color(0xFFE3F2FD))))
                .padding(24.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text("Reduce Stress", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }
        LazyColumn(modifier = Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(listOf("Deep Breathing", "Mindful Walk", "Body Scan")) { session ->
                Row(modifier = Modifier.fillMaxWidth().background(Color(0xFFF7F8FA), RoundedCornerShape(16.dp)).padding(16.dp)) {
                    Text("▶", color = Color(0xFFB2A4FF))
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(session)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ExercisesPreview() { ExercisesScreen() }