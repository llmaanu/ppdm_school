package br.senai.sp.jandira.ppppdm_school.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R


@Composable
fun StudentsListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .background(Color(0xFFF5F5F5))
    ) {
        // Header
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.lionking),
                contentDescription = "Logo",
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Lion School",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3347B0)
            )
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFFFFB800), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "DS",
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold,
                    fontSize =  20.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0xFFFFB800))
        )


        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Find a student",
                color = Color.Gray,
                modifier = Modifier.weight(1f)
            )
            Icon(
                painter = painterResource(R.drawable.lupa),
                contentDescription = "Search",
                tint = Color.Gray,
                modifier = Modifier.size(16.dp)


            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            FilterChip("Todos", true)
            FilterChip("Cursando", false)
            FilterChip("Finalizado", false)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row (horizontalArrangement = Arrangement.spacedBy(8.dp)){

            Icon(
                painter = painterResource(R.drawable.graduation),
                contentDescription = "list",
                tint = Color(0xFFFFB800),
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Students List",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3347B0)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            StudentCard("Luana Oliveira Dias", "20151001018", "2022", R.drawable.luana, "Finalizado")
            StudentCard("Pedro da Silva Borges", "20151001018", "2022", R.drawable.pedro,"Finalizado")
            StudentCard("Ana Clara Gomes", "20151001018", "2025", R.drawable.anaclara, "Cursando")
            StudentCard("Fabiana Luz Moraes", "20151001018", "2022", R.drawable.fabiana, "Finalizado")
            StudentCard("Carlos Augusto Nobre", "20151001018", "2025", R.drawable.carlos, "Cursando")
        }
    }
}

@Composable
fun FilterChip(text: String, selected: Boolean) {
    Box(
        modifier = Modifier
            .background(
                color = if (selected) Color(0xFF3347B0) else Color(0xFFFFB800),

                shape = RoundedCornerShape(50)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text = text, color = Color.White)
    }
}

@Composable
fun StudentCard(name: String, ra: String, year: String, photo: Int, status: String) {
    val borderColor = if (status == "Finalizado") Color(0xFFFFB800) else Color(0xFF3347B0)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(Color(0xFFBCC8DA), Color(0xFF89ACE7))
                ),
                shape = RoundedCornerShape(12.dp)
            )
            .height(80.dp)
    ) {
        Box(
            modifier = Modifier
                .width(8.dp)
                .fillMaxHeight()
                .background(borderColor,
                    shape = RoundedCornerShape(
                        topStart = 12.dp,
                        bottomStart = 12.dp
                    )
                )
        )

        Spacer(modifier = Modifier.width(12.dp))

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        ) {
            Image(
                painter = painterResource(id = photo),
                contentDescription = "Photo",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop

            )
        }

            Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(top = 18.dp)
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = ra,
                fontSize = 12.sp
            )
        }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(R.drawable.calendario),
                    contentDescription = "Calendar",
                    tint = Color(0xFFFFB800),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = year)
            }
        }
    }


@Preview(showSystemUi = true)
@Composable
fun PreviewStudentsList() {
    StudentsListScreen()
}