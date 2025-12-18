package com.yucatancorp.adminstore.login.presentation.composables

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yucatancorp.adminstore.R
import com.yucatancorp.adminstore.ui.theme.AdminStoreYucatanCorpTheme

@Composable
fun LoginScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { paddingValues ->
        LoginContainer(paddingValues)
    }
}

@Composable
fun LoginContainer(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .background(color = colorScheme.primaryContainer)
            .fillMaxSize()
            .padding(paddingValues),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppLogo()
        OutlinedTextField(
            value = "",
            onValueChange = {  },
            label = { Text("Username or Email") },
            singleLine = true,
            isError = false,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = colorScheme.onPrimaryContainer,
                focusedLabelColor = colorScheme.onPrimaryContainer,
                unfocusedTextColor = colorScheme.onPrimaryContainer,
                unfocusedLabelColor = colorScheme.onPrimaryContainer,
                focusedTextColor = colorScheme.onPrimaryContainer,
                disabledTextColor = colorScheme.onPrimaryContainer,
                cursorColor =  colorScheme.onPrimaryContainer,
                errorCursorColor = colorScheme.onPrimaryContainer,
                focusedBorderColor = colorScheme.onPrimaryContainer,
                disabledBorderColor = colorScheme.onPrimaryContainer
            )
        )
        OutlinedTextField(
            value = "",
            onValueChange = {  },
            label = { Text("Password") },
            singleLine = true,
            visualTransformation = if (true)
                VisualTransformation.None
            else
                PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {  }
            ),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = if (true)
                            painterResource(R.drawable.ic_visibility_on)
                        else
                            painterResource(R.drawable.ic_visibility_off),
                        contentDescription = null,
                        tint = colorScheme.onPrimaryContainer
                    )
                }
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = colorScheme.onPrimaryContainer,
                focusedLabelColor = colorScheme.onPrimaryContainer,
                unfocusedTextColor = colorScheme.onPrimaryContainer,
                unfocusedLabelColor = colorScheme.onPrimaryContainer,
                focusedTextColor = colorScheme.onPrimaryContainer,
                disabledTextColor = colorScheme.onPrimaryContainer,
                cursorColor =  colorScheme.onPrimaryContainer,
                errorCursorColor = colorScheme.onPrimaryContainer,
                focusedBorderColor = colorScheme.onPrimaryContainer,
                disabledBorderColor = colorScheme.onPrimaryContainer
            ),
            isError = null != null,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )
        Button(
            onClick = {}
        ) {
            Text(
                text = "Iniciar Sesión"
            )
        }
    }
}

@Composable
fun AppLogo() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = stringResource(R.string.admin_store_logo)
    )
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreview() {
    AdminStoreYucatanCorpTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreviewDarkMode() {
    AdminStoreYucatanCorpTheme {
        LoginScreen()
    }
}