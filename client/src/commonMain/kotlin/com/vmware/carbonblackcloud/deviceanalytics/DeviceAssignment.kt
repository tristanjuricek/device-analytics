package com.vmware.carbonblackcloud.deviceanalytics


data class DeviceAssignment(
    val timestamp: Date,
    val deviceId: String,
    var orgId: String,
    val hashKey: String,
    val shardId: String,
    val host: String
)