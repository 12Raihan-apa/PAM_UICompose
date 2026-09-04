package com.example.pam_UICompose.UICompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UICompose() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(
            text = "Profil Saya",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Foto Profil
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color(0xFFFF9800)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Foto Profil",
                tint = Color.White,
                modifier = Modifier.size(70.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Raihan Nasrullah Alamin",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )

        Text(
            text = "245150401111031",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.fillMaxWidth(),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )

        Spacer(modifier = Modifier.height(25.dp))

        ProfileItem(
            icon = Icons.Default.Email,
            title = "Email",
            value = "raihanalamin10.raa@email.com"
        )

        Spacer(modifier = Modifier.height(12.dp))

        ProfileItem(
            icon = Icons.Default.Phone,
            title = "Nomor Telepon",
            value = "085791301444"
        )

        Spacer(modifier = Modifier.height(12.dp))

        ProfileItem(
            icon = Icons.Default.LocationOn,
            title = "Lokasi",
            value = "Malang, Jawa Timur"
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Tentang Saya",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                    "nisi ut aliquip ex ea commodo consequat.",
            fontSize = 15.sp,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "Edit Profil",
                fontSize = 16.sp
            )
        }
    }
}

@Composable
fun ProfileItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White,
                RoundedCornerShape(12.dp)
            )
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,
            contentDescription = title,
            tint = Color(0xFFFF9800),
            modifier = Modifier.size(30.dp)
        )

        Spacer(modifier = Modifier.width(15.dp))

        Column {
            Text(
                text = title,
                fontSize = 13.sp,
                color = Color.Gray
            )

            Text(
                text = value,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}