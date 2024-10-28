package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.Image
import com.example.myapplication.ui.theme.MyApplicationTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var Animals = arrayListOf(R.drawable.animal0, R.drawable.animal1,

        R.drawable.animal2, R.drawable.animal3,

        R.drawable.animal4, R.drawable.animal5,

        R.drawable.animal6, R.drawable.animal7,

        R.drawable.animal8, R.drawable.animal9)
    var AnimalsName = arrayListOf("鴨子","企鵝","青蛙","貓頭鷹"," 海豚", "牛", "無尾熊", "獅子", "狐狸", "小雞")

Column {

    Row {

        Button(onClick = {

//your onclick code here

        }) {

            Text(text = "歡迎修課")
            Image(
                painter =
            )
        }

        Button(onClick = {

//your onclick code here

        }) {

            Text(text = "展翅飛翔")

        }

    }
    LazyRow{
        items(10) {index ->
            Text(index.toString(),
                modifier = modifier)
            androidx.compose.foundation.Image(
                painter = androidx.compose.ui.res.painterResource(id = Animals[index % 10]),
                contenDescription = "動物0"
            )
        }
    }
        LazyColumn() {


    }






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
