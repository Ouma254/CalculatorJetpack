package com.de_know.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.de_know.recipeapp.ui.theme.MediumGray
import com.de_know.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeAppTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(state = state, onAction = viewModel::onAction, buttonSpacing = buttonSpacing, modifier = Modifier.fillMaxSize().background(MediumGray).padding(16.dp))
            }
        }
    }
}

//@Composable
//fun DoSomething() {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        ) {
//        Column(modifier = Modifier.fillMaxHeight()) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = null
//                )
//                Spacer(modifier = Modifier.padding(64.dp),)
//                Text(text = "SATURDAY")
//
//            }
//            Spacer(modifier = Modifier.padding(8.dp))
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = null
//                )
//                Spacer(modifier = Modifier.padding(64.dp),)
//                Text(text = "SATURDAY")
//
//            }
//            Spacer(modifier = Modifier.padding(4.dp))
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = null,
//                    modifier = Modifier.height(48.dp).width(48.dp)
//                )
//                Spacer(modifier = Modifier.padding(64.dp),)
//                Text(
//                    text = "SATURDAY",
//                    style = MaterialTheme.typography.bodyLarge,
//                    color = Color.Blue
//                )
//
//
//            }
//
//
//        }
//
//
//    }
//
//}
