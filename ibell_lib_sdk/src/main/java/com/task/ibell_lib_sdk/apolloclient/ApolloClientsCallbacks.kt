package com.task.ibell_lib_sdk.apolloclient

import android.content.Context
import com.apollographql.apollo3.ApolloClient
import com.task.ibell.LaunchDetailsQuery
import com.task.ibell.LaunchListQuery

/*
* Specifies all the ApolloClient's callbacks
* @Type : suspend and non suspend methods
* */
interface ApolloClientsCallbacks {
    fun apolloClientInitialization(context :Context) : ApolloClient
    suspend fun apolloClientLaunchListApiCall(context: Context) : List<LaunchListQuery.Launch>?
    suspend fun apolloClientLaunchDetailApiCall(context: Context, launchId :String): LaunchDetailsQuery.Launch?
}