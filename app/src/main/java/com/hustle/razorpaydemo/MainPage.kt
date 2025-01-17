package com.hustle.razorpaydemo

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.platform.LocalContext
@Composable
fun MainPage(vm: PaymentViewModel = viewModel(),context: Context) {
    Column (modifier = Modifier.fillMaxSize()
        .padding(16.dp)
    ,verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedButton(onClick = {vm.startPayment(amountInRupees=100,context=context) }) {
            Text("You have to pay me")
        }
    }
}