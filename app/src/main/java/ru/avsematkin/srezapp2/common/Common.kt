package ru.avsematkin.srezapp2.common

import ru.avsematkin.srezapp2.retrofit.Client
import ru.avsematkin.srezapp2.service.Service

object Common {
    private const val BASE_URL = "https://6376c41981a568fc2505bab4.mockapi.io/"

    val service: Service = Client.getClient(baseUrl = BASE_URL).create(Service::class.java)
}