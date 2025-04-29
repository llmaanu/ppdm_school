
package br.senai.sp.jandira.ppdm_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun ScreenCourses() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff6f6f6))
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.lionking),
                contentDescription = "Logo Lion School",
                modifier = Modifier.size(70.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Lion School",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Find your course") },
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search")
            },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = null,
                tint = Color(0xff2e7d32),
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Courses",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff1b1b1b),
                textDecoration = TextDecoration.Underline,
            )
        }

        // Cards
        CursoCard(
            titulo = "Desenvolvimento de Sistemas",
            descricao = "Learn to develop web and mobile applications.",
            sigla = "DS",
            semestres = 3,
            imagem = R.drawable.ds
        )

        Spacer(modifier = Modifier.height(12.dp))

        CursoCard(
            titulo = "Redes de Computadores",
            descricao = "Learn to design communication networks.",
            sigla = "RDS",
            semestres = 3,
            imagem = R.drawable.rds
        )

        Spacer(modifier = Modifier.height(12.dp))

        CursoCard(
            titulo = "Eletroeletrônica",
            descricao = "Understand the fundamentals of electronics and systems.",
            sigla = "ELE",
            semestres = 3,
            imagem = R.drawable.eletro
        )
    }
}

@Composable
fun CursoCard(
    sigla: String,
    titulo: String,
    descricao: String,
    semestres: Int,
    imagem: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(Color(0xFF0066FF), Color(0xFF89ACE7))
                ),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(imagem),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = sigla,
                    fontSize = 55.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFB800)
                )
                Text(
                    text = titulo,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = descricao,
                    fontSize = 10.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.relogio),
                        contentDescription = "Clock",
                        tint = Color(0xFFFFB800),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "$semestres semesters",
                        fontSize = 14.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenCoursesPreview() {
    ScreenCourses()
}
