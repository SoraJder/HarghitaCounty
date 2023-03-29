package com.alina.harghitacounty.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.alina.harghitacounty.presentation.FirstScreen
import com.alina.harghitacounty.presentation.FourthScreen
import com.alina.harghitacounty.presentation.SecondScreen
import com.alina.harghitacounty.presentation.ThirdScreen

@Composable
fun HarghitaCountyNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.FIRST_PAGE_ROUTE
    ) {
        composable(
            route = Screens.FIRST_PAGE_ROUTE
        ) {
            FirstScreen(navController = navController)
        }
        composable(
            route = "${Screens.SECOND_PAGE_ROUTE}/{placeId}",
            arguments = listOf(navArgument(name = "placeId") {
                type = NavType.IntType
            })
        ) { entry ->
            SecondScreen(
                navController = navController,
                placeIndex = entry.arguments?.getInt("placeId")
            )
        }
        composable(
            route = "${Screens.THIRD_PAGE_ROUTE}/{placeId}",
            arguments = listOf(navArgument(name = "placeId") {
                type = NavType.IntType
            })
        ) { entry ->
            ThirdScreen(
                navController = navController,
                placeIndex = entry.arguments?.getInt("placeId")
            )
        }
        composable(
            route = "${Screens.FOURTH_PAGE_ROUTE}/{placeId}",
            arguments = listOf(navArgument(name = "placeId") {
                type = NavType.IntType
            })
        ) { entry ->
            FourthScreen(
                placeIndex = entry.arguments?.getInt("placeId")
            )
        }
    }
}