package com.example.ciclapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.ciclapp.constant.Const.Companion.NA
import com.example.ciclapp.constant.Const.Companion.cardColor
import com.example.ciclapp.model.forecast.ForecastResult
import com.example.ciclapp.utils.Utils.Companion.buildIcon
import com.example.ciclapp.utils.Utils.Companion.timestampToHumanDate

@Composable
fun ForecastSection(forecastResponse: ForecastResult) {
    return Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        forecastResponse.list?.let { listForecast ->
            if (listForecast!!.size > 0) {
                LazyRow(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(listForecast!!) { currentItem ->
                        currentItem.let { item ->
                            var temp = ""
                            var icon = ""
                            var time = ""
                            item.main.let { main ->
                                temp = if (main == null) NA else "${main.temp} °C"
                            }

                            item.weather.let { weather ->
                                icon = if (weather == null) NA else buildIcon(
                                    weather[0].icon!!,
                                    isBigSize = false
                                )
                            }

                            item.dt.let { dateTime ->
                                time = if (dateTime == null) NA
                                else timestampToHumanDate(dateTime.toLong(), "EEE HH:mm")
                            }

                            ForecastTile(temp = temp, image = icon, time = time)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ForecastTile(temp: String, image: String, time: String) {
    var fontSize = 20.sp
    Card(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),

        colors = CardDefaults.cardColors(
            containerColor = Color(cardColor),
            contentColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = temp.ifEmpty { NA }, color = Color.White, fontSize = fontSize)
            AsyncImage(
                model = image, contentDescription = image,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(0.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(text = time.ifEmpty { NA }, color = Color.White, fontSize = fontSize)
        }
    }
}
