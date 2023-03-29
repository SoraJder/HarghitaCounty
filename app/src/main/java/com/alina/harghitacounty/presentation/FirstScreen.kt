package com.alina.harghitacounty.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alina.harghitacounty.R
import com.alina.harghitacounty.navigation.Screens.SECOND_PAGE_ROUTE
import com.alina.harghitacounty.model.objectives_list
import com.alina.harghitacounty.ui.theme.*

@Composable
fun FirstScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (MaterialTheme.colors.isLight) PrimaryLightBackground else PrimaryDarkBackground)
    ) {
        Text(
            text = stringResource(R.string.places_to_visit),
            style = Typography.h4,
            color = if (MaterialTheme.colors.isLight) PrimaryLightOnBackground else PrimaryDarkOnBackground,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            objectives_list.forEachIndexed { index, place ->
                item {
                    //item list
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate(SECOND_PAGE_ROUTE + "/${index}")
                            }
                            .padding(4.dp)
                            .wrapContentHeight(),
                        shape = MaterialTheme.shapes.medium,
                        elevation = 5.dp,
                        backgroundColor = MaterialTheme.colors.surface
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = place.icon),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(8.dp),
                                contentScale = ContentScale.Fit
                            )
                            Column(
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Text(
                                    text = place.name,
                                    style = Typography.h6,
                                )
                                Text(
                                    text = place.subtitle,
                                    style = Typography.subtitle2,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}