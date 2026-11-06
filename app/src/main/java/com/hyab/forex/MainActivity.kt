
package com.hyab.forex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForexDashboard()
        }
    }
}

@Composable
fun ForexDashboard() {
    val bg = Color(0xFF0B1118)
    val gold = Color(0xFFFFC857)
    val card = Color(0xFF17212B)

    MaterialTheme(
        colorScheme = darkColorScheme(
            background = bg,
            surface = card,
            primary = gold
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(bg)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                "HYAB FOREX",
                color = gold,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Trading Dashboard",
                color = Color.White,
                fontSize = 22.sp
            )

            MarketCard("XAUUSD", "GOLD")
            MarketCard("EURUSD", "EURO / USD")
            MarketCard("GBPUSD", "POUND / USD")

            Text(
                "TRADING TOOLS",
                color = gold,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Lot Size Calculator",
                color = Color.White
            )

            Text(
                "Risk Management",
                color = Color.White
            )

            Text(
                "Trading Journal",
                color = Color.White
            )
        }
    }
}

@Composable
fun MarketCard(pair: String, description: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF17212B)
        )
    ) {
        Row(
            modifier = Modifier.padding(18.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    pair,
                    color = Color(0xFFFFC857),
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp
                )
                Text(
                    description,
                    color = Color.LightGray
                )
            }

            Text(
                "Demo",
                color = Color.White
            )
        }
    }
}

