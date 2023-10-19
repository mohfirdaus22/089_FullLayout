package com.example.pam_pertemuan4_real

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_pertemuan4_real.ui.theme.PAM_Pertemuan4_realTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Pertemuan4_realTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                        HomeScreen(message = "Moh Firdaus Maulana NI", From = "asdas")

                }
            }
        }
    }
}


@Composable
fun HomeScreen(message:String, From:String, modifier: Modifier=Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)){
        Text(
            color = Color.Black,
            text = message,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 20.dp, top = 20.dp)
        )
        Gambar()
        Spacer(modifier = modifier.padding(2.dp))
        SuhuLokasi()
        Spacer(modifier = modifier.padding(13.dp))
        keterangan()
    }
}

@Composable
fun Gambar(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .height(height = 300.dp)){

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.rain),
                contentDescription =null,
                modifier = Modifier.size(250.dp))
            Text(text = "Rain", fontSize = 30.sp)
        }
    }
}
@Composable
fun SuhuLokasi(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {
        Text(
            color = Color.Black,
            text = "19\u2103",
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
                contentDescription = null, modifier = Modifier.size(50.dp))

            Spacer(modifier = Modifier.padding(3.dp))

            Text(text =  "Yogyakarta",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.padding(13.dp))

        Text(text = "Kasihan, Bantul, Daerah Istimewa Yogyakarta",
            fontSize = 20.sp, color = Color.Gray, textAlign = TextAlign.Center
        )
    }

}

@Composable
fun keterangan(){
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .width(width = 350.dp)
        .height(height = 190.dp),
        contentAlignment = Alignment.Center) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(25.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Humidity")
                Text(
                    text = "98%",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunrise")
                Text(
                    text = "05.00 AM",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "UV Index")
                Text(
                    text = "9 / 10",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Sunset")
                Text(
                    text = "05.40 PM",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp)
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAM_Pertemuan4_realTheme {

    }
}