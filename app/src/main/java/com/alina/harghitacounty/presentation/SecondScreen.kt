package com.alina.harghitacounty.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alina.harghitacounty.R
import com.alina.harghitacounty.navigation.Screens
import com.alina.harghitacounty.model.objectives_list
import com.alina.harghitacounty.ui.theme.*

@Composable
fun SecondScreen(navController: NavController, placeIndex: Int?) {
    val place = placeIndex?.let { index ->
        objectives_list[index]
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (MaterialTheme.colors.isLight) PrimaryLightBackground else PrimaryDarkBackground)
    ) {
        Text(
            text = place?.name ?: "Error",
            style = Typography.h4,
            color = if (MaterialTheme.colors.isLight) PrimaryLightOnBackground else PrimaryDarkOnBackground,
            modifier = Modifier
                .padding(4.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )

        Text(
            text = place?.subtitle ?: "Error",
            style = Typography.subtitle1,
            color = if (MaterialTheme.colors.isLight) PrimaryLightOnBackground else PrimaryDarkOnBackground,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(id = place?.image ?: R.drawable.warning),
            contentDescription = null,
            modifier = Modifier
                .aspectRatio(3f / 2f)
                .padding(start = 24.dp, end = 24.dp, bottom = 16.dp),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center
        )

        Text(
            text = place?.shortDescription ?: "Error",
            style = Typography.body1,
            color = if (MaterialTheme.colors.isLight) PrimaryLightOnBackground else PrimaryDarkOnBackground,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(start = 24.dp, end = 24.dp),
            textAlign = TextAlign.Center
        )

        TextButton(
            onClick = { navController.navigate(Screens.THIRD_PAGE_ROUTE + "/${placeIndex}") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(start = 24.dp, end = 24.dp, top = 16.dp)
        ) {
            Text(
                text = stringResource(R.string.read_more_about),
                letterSpacing = 1.sp,
                style = Typography.button,
                textAlign = TextAlign.Center
            )
        }

        placeIndex?.let { index ->
            when (index) {
                0 -> {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(
                            onClick = {
                                navController.popBackStack()
                                navController.navigate(Screens.SECOND_PAGE_ROUTE + "/1")
                            },
                            modifier = Modifier
                                .padding(start = 24.dp, end = 24.dp, top = 16.dp)
                        ) {
                            Text(
                                text = "2.${objectives_list[1].name}",
                                style = Typography.button,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
                11 -> {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.Bottom
                    ) {
                        TextButton(
                            onClick = {
                                navController.popBackStack()
                                navController.navigate(Screens.SECOND_PAGE_ROUTE + "/10")
                            },
                        ) {
                            Text(
                                text = "11.${objectives_list[10].name}",
                                style = Typography.button,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
                else -> {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TextButton(
                            onClick = {
                                navController.popBackStack()
                                navController.navigate(Screens.SECOND_PAGE_ROUTE + "/${index - 1}")
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "${index}.${objectives_list[index - 1].name}",
                                style = Typography.button,
                                textAlign = TextAlign.Center
                            )
                        }
                        TextButton(
                            onClick = {
                                navController.popBackStack()
                                navController.navigate(Screens.SECOND_PAGE_ROUTE + "/${index + 1}")
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "${index + 2}.${objectives_list[index + 1].name}",
                                style = Typography.button,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}