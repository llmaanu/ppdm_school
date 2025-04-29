package br.senai.sp.jandira.ppdm_school.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R
import org.w3c.dom.Text

@Composable
fun LionSchoolHomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .background(color = Color(0xFFEFEFEF)) ,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(
                modifier = Modifier.height(48.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 130.dp, bottom = 60.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.lionking),
                    contentDescription = "Lion School logo",
                    modifier = Modifier
                        .height(100.dp)
                        .padding(end = 16.dp)
                )

                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Lion",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF2A47B5),
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "School",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF2A47B5),
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
            Spacer(
                modifier = Modifier.height(36.dp)
            )
            Text(
                text = "Find Your Favorite Course",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3246A9)
            )
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(6.dp)
                    .background(color = Color(color = 0xFFE9B33E))
                    .border(
                        width = 2.dp,
                        color = Color(color = 0xFFE9B33E),
                        shape = RoundedCornerShape(54.dp)
                    )
            )
            Text(
                text = "Get to your destination faster, study at the best vocational school in Brazil. Be the best version of yourself.",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(top = 12.dp),
                lineHeight = 22.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Blue,
                        shape = RoundedCornerShape(19.dp),
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(color = 0xFFF4B93E)
                )
            )

 { Text (
                text = "Get Started",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(color = 0xFF172242)
            )
                Spacer(modifier = Modifier.height(32.dp))
            }
            Row (
                modifier = Modifier
                    .padding(bottom = 32.dp, top = 220.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                val icon = listOf(
                    R.drawable.yt,
                    R.drawable.tt,
                    R.drawable.insta,
                    R.drawable.face
                )
                icon.forEach {
                    Image(
                        painter = painterResource(id = it),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .height(32.dp)
                    )
                }
            }



            
        }
    }
}











    @Preview(showSystemUi = true)
@Composable
private fun LionSchoolHomeScreenPreview() {
    LionSchoolHomeScreen()
}

