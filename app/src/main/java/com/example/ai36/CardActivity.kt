package com.example.ai36

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                GridLayoutApp()
            }
        }
    }
}

@Composable
fun GridLayoutApp() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)

    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "7:14", color = Color.Black, style = TextStyle(fontSize = 12.sp)) // Placeholder for Time
            Row {
                Image( //  Wifi Image Placeholder
                    painter = painterResource(id = R.drawable.wifi), //  Replace with your actual wifi icon
                    contentDescription = "Wifi",
                    modifier = Modifier.size(28.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image( // Network Image Placeholder
                    painter = painterResource(id = R.drawable.network),  // Replace with your actual network icon
                    contentDescription = "Network",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image( // Battery Image Placeholder
                    painter = painterResource(id = R.drawable.battery), // Replace with your actual battery icon
                    contentDescription = "Battery",
                    modifier = Modifier.size(24.dp)
                )

            }
        }
        //  Profile Icon Row
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End,
        ) {
            GridItemCard(title = "Profile", imageId = R.drawable.dp, modifier = Modifier.size(80.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(text = "Card",  // Display "Card" as text
                style = TextStyle(fontSize = 32.sp),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(8.dp) //Added padding.

            )
            // GridItemCard(title = "Card", imageId = R.drawable.card_icon, modifier = Modifier.size(80.dp))
        }

        Text(
            text = "Simple and easy to use app",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Grid structure using Rows and Columns
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GridItemCard(title = "Text", imageId = R.drawable.text, modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                GridItemCard(title = "Address", imageId = R.drawable.address, modifier = Modifier.weight(1f))
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GridItemCard(title = "Character", imageId = R.drawable.character, modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                GridItemCard(title = "Bank card", imageId = R.drawable.bankcard, modifier = Modifier.weight(1f))
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GridItemCard(title = "Password", imageId = R.drawable.password, modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                GridItemCard(title = "Logistics", imageId = R.drawable.logistics, modifier = Modifier.weight(1f))
            }
        }

        // Settings Icon Row
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            horizontalArrangement = Arrangement.Start,
        ) {
            GridItemCard(title = "Settings", imageId = R.drawable.settings, modifier = Modifier.size(80.dp))
        }
    }
}

@Composable
fun GridItemCard(title: String, imageId: Int, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(120.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = title,
                modifier = Modifier.size(48.dp)
                    .width(100.dp).clip(shape = RoundedCornerShape(100.dp)),
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = title,
                style = TextStyle(fontSize = 14.sp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface {
        GridLayoutApp()
    }
}
