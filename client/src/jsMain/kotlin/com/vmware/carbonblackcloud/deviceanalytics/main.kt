package com.vmware.carbonblackcloud.deviceanalytics

fun main() {

    val deviceAssignmentJs = DeviceAssignment(
            Date(),
            "device123",
            "org123",
            "hashKey",
            "shardId-0001",
            "test.example.com"
    )
    console.log("deviceAssignment", deviceAssignmentJs)
}
